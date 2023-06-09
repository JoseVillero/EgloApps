package com.adsosena.egloapps.models;

import com.adsosena.egloapps.entities.Rol;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.HashSet;
import java.util.Set;

/**Clase UsuarioModel:
 * Esta clase representa un modelo de una entidad(tabla) de la base de datos.
 * Un modelo es un objeto intermedio que puede representar un objeto de la entidad. Ya sea para convertirse
 * en la entidad o ya está convertido de una entidad
 * @author Jose David */
@Getter
@AllArgsConstructor
public class UsuarioModel {

    private String nombreCompleto;

    private String email;

    private String password;

    private String telefono;

    private boolean enable;

    private Set<Rol> roles;

    public UsuarioModel() {
        this.roles = new HashSet<>();
    }

    public void setNombreCompleto(String nombreCompleto) {
        if(nombreCompleto !=null && !nombreCompleto.isBlank()){
            this.nombreCompleto = nombreCompleto;
        }

    }

    public void setEmail(String email) {
        if(email !=null && !email.isBlank()){
            this.email = email;
        }
    }

    public void setPassword(String password) {
        if(password !=null && !password.isBlank()){
            this.password = password;
        }
    }

    public void setTelefono(String telefono) {
        if(telefono !=null && !telefono.isBlank()){
            this.telefono = telefono;
        }
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public void setEnable(String enable) {
        this.enable = Boolean.parseBoolean(enable);
    }

    @Override
    public String toString() {
        return "UsuarioModel{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", telefono='" + telefono + '\'' +
                ", enable=" + enable +
                ", roles=" + roles +
                '}';
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
    public void setRoles(String rol) {
        roles.add(Rol.valueOf(rol));
    }
}
