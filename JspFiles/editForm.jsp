
/////////////////////
// Search and replace (OPTION + CMD + F) 
// Match case 

// language
// Language
// name
// Name
// creator
// Creator
// version
// Version


<form:form id="Language" action="/language/${id}/edit" method="post" modelAttribute="language">
    <input type="hidden" name="_method" value="put">
    <p class="form-group">
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name" class="form-control" type="text" value="${language.name}"/>
    </p>
    
    <p class="form-group">
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator" class="form-control" type="text" value="${language.creator}"/>
    </p>
    
    <p class="form-group">
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version" class="form-control" type="text" value="${language.currentVersion}"/>
    </p>
    
    <p>
        <input class="btn btn-primary" type="submit" value="Submit"/>
        <a class="btn btn-danger" href="/">cancel</a>
    </p>
</form:form>