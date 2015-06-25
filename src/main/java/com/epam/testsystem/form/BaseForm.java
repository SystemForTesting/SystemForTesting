package com.epam.testsystem.form;

import org.apache.struts.action.ActionForm;

public class BaseForm extends ActionForm {
    protected Long id;
    protected boolean deleted;
//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;
//    private User createdBy;
//    private User updatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
