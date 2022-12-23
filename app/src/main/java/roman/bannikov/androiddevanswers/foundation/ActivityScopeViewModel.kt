package roman.bannikov.androiddevanswers.foundation

import androidx.lifecycle.ViewModel
import roman.bannikov.androiddevanswers.foundation.navigator.IntermediateNavigator
import roman.bannikov.androiddevanswers.foundation.navigator.Navigator
import roman.bannikov.androiddevanswers.foundation.uiactions.UiActions

/**
 * Implementation of [Navigator] and [UiActions].
 * It is based on activity view-model because instances of [Navigator] and [UiActions]
 * should be available from fragments' view-models (usually they are passed to the view-model constructor).
 */

/**
 * ActivityScopeViewModel используется как место для реализации Navigator и UiActions.
 * Всё, что делает этот класс - содержит ссылки, которые находятся в одном из скоупов. Эти ссылки
 * потом пробрасываются во вью-модели фрагментов, если это нужно.
 * Реализации UiActions и Navigator разделены
 * */



class ActivityScopeViewModel(
    val uiActions: UiActions, //зависимость
    val navigator: IntermediateNavigator //зависимость
) : ViewModel(),
    Navigator by navigator,
    UiActions by uiActions {

    override fun onCleared() {
        super.onCleared()
        navigator.clear()
    }

}