This is the client portion of application.  It is a React application and
serves mainly as a mechanism for learning some React things, but also for
understanding how the client portion of the application obtains and uses
a token that is required when interacting with the backend

Requirements:
1. Only authenticated users should be able to see any part of the application,
with the exception of messages indicating that the user is not authenticated
2. Authentication is done via mutual-auth PKI.  However, mutual-auth should
only be required for authentication and should not be required for any further
interaction with the application
3. The client must be aware that the authentication token has an expiration
and must be able to renew the token or cause the user to re-authenticate when
necessary
4. The client must include the auth token for access-control when making requests of
the back-end services.
5. The client must be prepared to handle status from the back-end saying that
the user's credentials are not sufficient to perform the requested operation


To build:

???

To run: