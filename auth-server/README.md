This is the authentication service for the application.  It is responsible
for performing authentication of users and for providing an auth token that
can be used by the rest of the application to perform access control

Requirements:
1. Authentication is done with mutual-auth PKI
2. Authorization will be accomplished with role-based access-controls
3. Authentication will result in a JWT which will be returned to the caller
upon successful authentication
4. The JWT will include the following
   1. The user's identity (username, name, etc)
   2. The roles the user has been assigned
   3. An expiration date/time (configurable)
   4. A digital signature over the above items
      1. Signing can be done with the auth-server's tls private key/certriciate pair
   5. Any other mechanisms needed to prevent unauthorized use of a token


The expected interaction pattern is that if the client portion of the application
detects that no valid auth-token is available, it will redirect the user to an
endpoint in the auth-server where authentication will occur.  Upon successful
completions of authentication, a token will be returned to the client software.
The client will use this token to determine what functions should be available
to the user and will include the token in any requests made to the back-end
portion of the application (where additional access control decisions may be
made)

At some point in the future, we may also want to support the concept of logging
out, but that may be simply a front-end concept where the front-end 'forgets'
the user's current token (and the back-end has no concept of 'logout' - a valid 
token can be used as long as it hasnt expired).  In this case, the auth-server 
should issue a new token every time authentication is requested (since logging
out and then logging back in should at least reset the expiration time of the
token relative to the most recent login).  We rely on the browser to prompt
the user for PINs and/or password as needed when presenting client certificates.
(Depending on the source of client PKI material, it is possible that a user
might only be prompted for e.g., a PIN the first time the client certificate
needs to be presented and subsequent visits to the authentication endpoint
may not require user interaction and may be transparent to the user)
