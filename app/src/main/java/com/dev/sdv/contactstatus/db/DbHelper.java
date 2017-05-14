package com.dev.sdv.contactstatus.db;

import java.util.List;

import com.dev.sdv.contactstatus.models.Status;
import com.dev.sdv.contactstatus.models.User;
import com.google.firebase.database.DatabaseError;

public interface DbHelper {

    interface UserCRUD {

        void saveUser(User user, OnUserChangeListener listener);

        boolean updateUser(User user, OnUserChangeListener listener);

        boolean deleteUser(User user, OnUserChangeListener listener);

        User findUserById(String id);

        List<User> findAll();
    }

    interface StatusCRUD {

        void saveStatus(Status status, OnStatusChangeListener listener);

        boolean updateStatusByUserId(Status status, OnStatusChangeListener listener);

        boolean deleteStatusByUserId(Status status, OnStatusChangeListener listener);

        Status findStatusByUserId(String uid);
    }

    interface OnUserChangeListener {

        void onUserChangeSuccess();

        void onUserChangeFailed(String error);
    }

    interface OnStatusChangeListener {

        void onStatusChangeSuccess();

        void onStatusChangeFailed(String error);
    }

    interface OnChildExistsListener{

        void onChildExists();

        void onChildNotExists();

        void onCanceled(DatabaseError databaseError);
    }

    class FirebaseReference{

        public static final String USERS = "users";
        public static final String STATUSES = "statuses";
    }
}