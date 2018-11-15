package dwsession.auth;

import dwsession.api.User;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;

import java.util.Optional;

public class DWSessionAuthenticator implements Authenticator {

    @Override
    public Optional<User> authenticate(Object o) throws AuthenticationException {

        return Optional.empty();
    }
}
