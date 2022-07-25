package com.github.hamzaahmedkhan.sealed_class_common;

import com.github.hamzaahmedkhan.sealed_common_sdk.ProfileType;

public class TestJava {

    public static void main(String[] args) {

        TestJava.test(new ProfileType.ProfileError("s"));
        TestJava.test(ProfileType.Idle.INSTANCE);
    }

    public static void test(ProfileType profileType) {
        if (profileType instanceof ProfileType.Idle) {

        } else if (profileType instanceof ProfileType.ProfileSuccess) {

        } else if (profileType instanceof ProfileType.ProfileError) {
            ((ProfileType.ProfileError) profileType).getErrorMessage();
        } else {
            // Default
        }
    }


}
