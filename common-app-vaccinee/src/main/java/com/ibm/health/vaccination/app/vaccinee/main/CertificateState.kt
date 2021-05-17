package com.ibm.health.vaccination.app.vaccinee.main

import com.ibm.health.common.android.utils.BaseEvents
import com.ibm.health.common.android.utils.BaseState
import com.ibm.health.vaccination.app.vaccinee.dependencies.vaccineeDeps
import kotlinx.coroutines.CoroutineScope

/**
 * State class which provides the [onFavoriteClick] function to mark a Certificate as favorite
 */
internal class CertificateState(scope: CoroutineScope) : BaseState<BaseEvents>(scope) {

    fun onFavoriteClick(certId: String) {
        launch {
            vaccineeDeps.toggleFavoriteUseCase.toggleFavorite(certId)
        }
    }
}
