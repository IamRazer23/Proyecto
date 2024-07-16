package logica;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> users;

    public Login() {
        users = new HashMap<>();
        // Añadir usuarios por defecto
        users.put("admin", "admin");
    }

    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}

