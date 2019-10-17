
/////////////////////
// Search and replace (OPTION + CMD + F) 
// Match case 

// languages
// language
// name
// Name
// creator
// Creator
// version
// Version




<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Creator</th>
            <th scope="col">Version</th>
            <th scope="col">Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${languages}" var="language">
            <tr>
                <td><a href="/language/${language.id}"><c:out value="${language.name}"/></a></td>
                <td><c:out value="${language.creator}"/></td>
                <td><c:out value="${language.version}"/></td>
                <td>
                    <p>
                        <a class="btn btn-primary" href="/language/${language.id}">Show</a>
                        <a class="btn btn-dark" href="/language/${language.id}/edit">Edit</a>
                        <a class="btn btn-danger" href="/language/${language.id}/destroy">Delete</a>
                    </p>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>