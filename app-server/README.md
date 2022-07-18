This is the back-end portion of the application.  It supports the front-end
by providing endpoints that the front-end can invoke to performed necessary
operations.  It is a spring boot application and makes use of sprint security
for access controls.

Requirements:
1. All requests made to the back-end must include a JWT which contains inforamtion
about the roles that have been assigned to the requesting user so that the
back-end can determine whether or not to service the request
2. The application should use REST architectural principles and should use 
http(s) as its application protocol.
3. The back-end should provide a number of endpoints with varying role requirements
so as to allow testing of access control across the entire application
4. 