package com.allpo.tools.models;

public class Constants {

    public enum StaffRoles {
        ACCUEIL, CHECKING, VESTIAIRE_G, VESTIAIRE_F
    }

    public enum Phases{
        PREPARATION, ACCUEIL, PRECONCOURS, CONCOURS, POSTCONCOURS
    }

    public static StaffRoles[] ROLES_PRIORITIES
            = new StaffRoles[]{StaffRoles.VESTIAIRE_F, StaffRoles.VESTIAIRE_G };
}
