package ua.kpi.fpm.pma.oop.lecture7.mvc.model;

public class HospitableAuthenticationModel implements AuthenticationModel {
    @Override
    public boolean authenticate(String login, String password) {
        return true;
    }
}
