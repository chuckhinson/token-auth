import { useEffect, useState } from 'react';


function Authenticator() {

  const [authData, setAuthData] = useState(null);
  const [authenticating, setAuthenticating] = useState(false);

  useEffect(() => {
    setAuthenticating(true);

    fetch('https://auth.authtest.chinson.org:8443/auth')
      .then(response => response.text())
      .then(data => {
        setAuthData(data);
        setAuthenticating(false);
      })
  }, []);

  if (authenticating) {
    return (
      <p> Authenticating... </p>
    );
  }

  return (
      <p> Authenticated! </p>
  )

}

export default Authenticator;
