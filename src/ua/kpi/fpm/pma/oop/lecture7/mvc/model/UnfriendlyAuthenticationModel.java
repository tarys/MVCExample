package ua.kpi.fpm.pma.oop.lecture7.mvc.model;

public class UnfriendlyAuthenticationModel implements AuthenticationModel {
    @Override
    public boolean authenticate(String login, String password) {
        return false;
    }
}
