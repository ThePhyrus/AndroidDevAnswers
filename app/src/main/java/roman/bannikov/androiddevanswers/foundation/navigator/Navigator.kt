package roman.bannikov.androiddevanswers.foundation.navigator

import roman.bannikov.androiddevanswers.foundation.views.BaseScreen

/**
 * Navigation for your application
 *
 * Примитивная стековая навигация, котрая позволяет запускать экраны, передавая в них каки-то
 * результаты, а также возвращаться на предыдущий экран и отдавать каки-то результаты обратно.
 */


interface Navigator {

    /**
     * Launch a new screen at the top of back stack.
     */
    fun launch(screen: BaseScreen, add:Boolean)

    /**
     * Go back to the previous screen and optionally send some results.
     */
    fun goBack(result: Any? = null)

}