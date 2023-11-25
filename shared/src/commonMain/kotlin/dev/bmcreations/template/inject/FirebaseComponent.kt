package dev.bmcreations.template.inject

import dev.bmcreations.template.domain.authentication.firebase.GoogleIdProvider
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.auth
import me.tatarka.inject.annotations.Provides

interface FirebaseComponent {
    @Provides fun providesFirebaseAuth() = Firebase.auth
}