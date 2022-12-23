package roman.bannikov.androiddevanswers.foundation.views

import roman.bannikov.androiddevanswers.foundation.ActivityScopeViewModel

/**
 * Implement this interface in the activity.
 */
interface FragmentsHolder {

    /**
     * Called when activity views should be re-drawn.
     */
    fun notifyScreenUpdates() //любой фрагмент сможет вызвать этот метод

    /**
     * Get the current implementations of dependencies from activity VM scope.
     * Для получения ActivityScopeViewModel
     */
    fun getActivityScopeViewModel(): ActivityScopeViewModel

}