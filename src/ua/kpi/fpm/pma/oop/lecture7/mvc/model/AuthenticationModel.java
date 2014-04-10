package ua.kpi.fpm.pma.oop.lecture7.mvc.model;

/**
 * Created by Taras on 10.04.2014.
 */
public interface AuthenticationModel {
    boolean authenticate(String login, String password);
}
