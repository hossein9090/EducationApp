<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>BookList</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.4.1/dist/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
<div style="text-align: center" ;>

<div class="row">
    <div class=" col-md-4" style="display: inline-block ; padding-left: 5% ;padding-right: 5%">
        <br><br><br>

        <input type="button" value="Add Teacher"
               onclick="window.location.href='Teacher/showForm'; return false;"
               class="btn btn-primary"/>
        <br/><br/>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Teacher List</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>email</th>

                    </tr>

                    <!-- loop over and print our customers -->
                    <c:forEach var="tempTeacher" items="${teacher}">

                        <!-- construct an "update" link with customer id -->
                        <c:url var="updateLink" value="/Teacher/update">
                            <c:param name="teacherId" value="${tempTeacher.id}"/>
                        </c:url>

                        <!-- construct an "delete" link with customer id -->
                        <c:url var="deleteLink" value="/Teacher/delete">
                            <c:param name="teacherId" value="${tempTeacher.id}"/>
                        </c:url>

                        <tr>
                            <td>${tempTeacher.firstName}</td>
                            <td>${tempTeacher.lastName}</td>
                            <td>${tempTeacher.email}</td>

                            <td>
                                <!-- display the update link --> <a href="${updateLink}">Update</a>
                                | <a href="${deleteLink}"
                                     onclick="if (!(confirm('Are you sure you want to delete this Teacher?'))) return false">Delete</a>
                            </td>

                        </tr>

                    </c:forEach>

                </table>

            </div>
        </div>
    </div>

    <div class=" col-md-4" style="display: inline-block ; padding: 5% ;padding-right: 5%;">

        <input type="button" value="Add TeacherCourse"
               onclick="window.location.href='Teacher-Course/showForm'; return false;"
               class="btn btn-primary"/>
        <br/><br/>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Teacher Course List</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>teacher Id</th>
                        <th>course Id</th>

                    </tr>

                    <!-- loop over and print our customers -->
                    <c:forEach var="tempTeacherCourse" items="${teacherCourse}">

                        <!-- construct an "update" link with customer id -->
                        <c:url var="updateLink" value="/Teacher-Course/update">
                            <c:param name="teacherCourseId" value="${tempTeacherCourse.id}"/>
                        </c:url>

                        <!-- construct an "delete" link with customer id -->
                        <c:url var="deleteLink" value="/Teacher-Course/delete">
                            <c:param name="teacherCourseId" value="${tempTeacherCourse.id}"/>
                        </c:url>

                        <tr>
                            <td>${tempTeacherCourse.teacherId}</td>
                            <td>${tempTeacherCourse.courseId}</td>

                            <td>
                                <!-- display the update link --> <a href="${updateLink}">Update</a>
                                | <a href="${deleteLink}"
                                     onclick="if (!(confirm('Are you sure you want to delete this Teacher_Course?'))) return false">Delete</a>
                            </td>

                        </tr>

                    </c:forEach>



                </table>

            </div>

        </div><hr><hr>
        <input style="color: #56e0b7;height: 60px" type="button" value="click to adding course to a teacher"
               onclick="window.location.href='Teacher-Course/showForm'; return false;"
               class="btn btn-primary"/>
    </div>


    <div class=" col-md-4" style="display: inline-block ; padding: 5% ;padding-right: 5%;">


        <input type="button" value="Add Course"
               onclick="window.location.href='Course/showForm'; return false;"
               class="btn btn-primary"/>
        <br/><br/>
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Course List</div>
            </div>
            <div class="panel-body">
                <table class="table table-striped table-bordered">
                    <tr>
                        <th>Name</th>
                        <th>Course Time</th>

                    </tr>

                    <!-- loop over and print our customers -->
                    <c:forEach var="tempCourse" items="${courses}">

                        <!-- construct an "update" link with customer id -->
                        <c:url var="updateLink" value="/Course/update">
                            <c:param name="courseId" value="${tempCourse.id}"/>
                        </c:url>

                        <!-- construct an "delete" link with customer id -->
                        <c:url var="deleteLink" value="/Course/delete">
                            <c:param name="courseId" value="${tempCourse.id}"/>
                        </c:url>

                        <tr>
                            <td>${tempCourse.name}</td>
                            <td>${tempCourse.courseTime}</td>

                            <td>
                                <!-- display the update link --> <a href="${updateLink}">Update</a>
                                | <a href="${deleteLink}"
                                     onclick="if (!(confirm('Are you sure you want to delete this course?'))) return false">Delete</a>
                            </td>

                        </tr>

                    </c:forEach>

                </table>

            </div>
        </div>
    </div>

</div>

</div>

</body>
</html>