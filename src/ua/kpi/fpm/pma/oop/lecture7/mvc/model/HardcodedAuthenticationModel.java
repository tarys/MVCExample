package ua.kpi.fpm.pma.oop.lecture7.mvc.model;

import java.util.HashMap;
import java.util.Map;

public class HardcodedAuthenticationModel implements AuthenticationModel {

    private final Map<String, String> userMap;

    public HardcodedAuthenticationModel() {
        this.userMap = new HashMap<>();
        userMap.put("Taras Slipets", "");
        userMap.put("Master Joda", "Be the force with you");
    }

    @Override
    public boolean authenticate(String login, String password) {
        return this.userMap.get(login).equals(password);
    }
}
