package com.epam.testsystem.repository;

import com.epam.testsystem.model.BaseEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface CustomCrudRepository<T extends BaseEntity> extends Repository<T, Long> {
    <S extends T> S save(S var1);

    <S extends T> Iterable<S> save(Iterable<S> var1);

    @Query("select x from #{#entityName} x where x.deleted = 0 and x.id = ?1")
    T findOne(Long aLong);

    @Query("select x from #{#entityName} x where x.deleted = 0")
    Iterable<T> findAll();

    @Query("select x from #{#entityName} x where x.deleted = 0 and x.id in ?1")
    Iterable<T> findAll(Iterable<Long> iterable);

    @Query("select case when(count(x) > 0) then true else false end from #{#entityName} x where x.deleted = 0 and x.id = ?1")
    boolean exists(Long aLong);

    @Query("select count(x) from #{#entityName} x where x.deleted = 0")
    long count();

    @Modifying
    @Query("UPDATE #{#entityName} x set x.deleted = 1 where x.id = ?1")
    void delete(Long aLong);

    @Modifying
    @Query("UPDATE #{#entityName} x set x.deleted = 1 where x = ?1")
    void delete(T t);

    @Modifying
    @Query("UPDATE #{#entityName} x set x.deleted = 1 where x in ?1")
    void delete(Iterable<? extends T> iterable);

    @Modifying
    @Query("UPDATE #{#entityName} x set x.deleted = 1")
    void deleteAll();
}
