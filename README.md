This project is meant to facilitate some experiments to learn about
authentication and authorization in a system using PKI and (JWT) tokens

This application consists of three components

* An 'auth' server that takes care of authentication and authorization
  * It does authentication via PKI/client ssl. 
  * It facilitates authorization by constructing a token that includes role information 
    that can be used by the main application to do access control
* A 'client' server that simply serves the static contents of the application's UI
  * (This could very well be part of the main application server, but I'v chosen to make
    it separate for now as it aligns with the real-world things I'd like to understand better)
* An 'application' server that contains the 'back-end' for the aplication.
  * This is where authorization/access control actually takes place and uses the token obtained
    from the 'auth' server
