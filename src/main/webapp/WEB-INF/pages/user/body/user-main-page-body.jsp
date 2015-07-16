<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-nested" prefix="nested" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<div class="col-lg-6 width-25-perc padding-5px">
    <div class="container-fluid">
        <div><label><bean:message key="user.username"/>:</label>

            <div>${user.username}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.first.name"/>:</label>

            <div>${user.firstName}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.last.name"/>:</label>

            <div>${user.lastName}</div>
        </div>
    </div>
    <div class="container-fluid">
        <div><label><bean:message key="user.email"/>:</label>

            <div>${user.email}</div>
        </div>
    </div>
    <br/>

    <div>
        <nested:form action="/changePassword">
            <div align="center">
                <html:submit styleClass="btn btn-primary btn-raised add-qwest-button" styleId="save">
                    <bean:message key="change.password"/>
                </html:submit>
                <html:hidden property="user.password"/>
            </div>
            <input class="hidden" type="hidden"
                   name="${_csrf.parameterName}"
                   value="${_csrf.token}"/>
        </nested:form>
    </div>
</div>
<div class="col-lg-6 width-73-perc padding-5px">
    <div class="bs-example bs-example-tabs" data-example-id="togglable-tabs">
        <ul id="myTabs" class="nav nav-tabs" role="tablist">
            <li role="presentation" class=""><a href="#home" id="home-tab" role="tab" data-toggle="tab"
                                                aria-controls="home" aria-expanded="false">Home</a></li>
            <li role="presentation" class="active"><a href="#profile" role="tab" id="profile-tab" data-toggle="tab"
                                                      aria-controls="profile" aria-expanded="true">Profile</a></li>
        </ul>
        <div id="myTabContent" class="tab-content">
            <div role="tabpanel" class="tab-pane fade" id="home" aria-labelledby="home-tab">
                <p>Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua,
                    retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica.
                    Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry
                    richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american
                    apparel, butcher voluptate nisi qui.</p>
            </div>
            <div role="tabpanel" class="tab-pane fade active in" id="profile" aria-labelledby="profile-tab">
                <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation
                    +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table
                    craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts
                    ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda labore aesthetic magna delectus mollit.
                    Keytar helvetica VHS salvia yr, vero magna velit sapiente labore stumptown. Vegan fanny pack odio
                    cillum wes anderson 8-bit, sustainable jean shorts beard ut DIY ethical culpa terry richardson
                    biodiesel. Art party scenester stumptown, tumblr butcher vero sint qui sapiente accusamus tattooed
                    echo park.</p>
            </div>
            <div role="tabpanel" class="tab-pane fade" id="dropdown1" aria-labelledby="dropdown1-tab">
                <p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro
                    fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer,
                    iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony.
                    Leggings gentrify squid 8-bit cred pitchfork. Williamsburg banh mi whatever gluten-free, carles
                    pitchfork biodiesel fixie etsy retro mlkshk vice blog. Scenester cred you probably haven't heard of
                    them, vinyl craft beer blog stumptown. Pitchfork sustainable tofu synth chambray yr.</p>
            </div>
            <div role="tabpanel" class="tab-pane fade" id="dropdown2" aria-labelledby="dropdown2-tab">
                <p>Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master
                    cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party
                    locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before
                    they sold out farm-to-table VHS viral locavore cosby sweater. Lomo wolf viral, mustache readymade
                    thundercats keffiyeh craft beer marfa ethical. Wolf salvia freegan, sartorial keffiyeh echo park
                    vegan.</p>
            </div>
        </div>
    </div>
</div>
