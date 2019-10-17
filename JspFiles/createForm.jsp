
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


<form:form id="Language" action="/new" method="post" modelAttribute="language">
				
    <p class="form-group">
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name" class="form-control" type="text" value=""/>
    </p>
    
    <p class="form-group">
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input path="creator" class="form-control" type="text" value=""/>
    </p>
    
    <p class="form-group">
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input path="version" class="form-control" type="text" value=""/>
    </p>
    
    <p>
        <input class="btn btn-primary" type="submit" value="Submit"/>
    </p>
</form:form>
			