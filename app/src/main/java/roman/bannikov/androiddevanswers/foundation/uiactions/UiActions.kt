package roman.bannikov.androiddevanswers.foundation.uiactions

/**
 * Common actions that can be performed in the view-model
 *
 * Здесь описыаются типичные действия, которые можно выполнять с самых различных экранов.
 * Сами вью-модели для уже конкретных экранов будут знать только об интерфейсах UiActions и
 * Navigator, но ничего не будут знать об их реализации
 */

interface UiActions {

    /**
     * Все действия ниже не зависят от активити
     * */

    /**
     * Показать простое тост-сообщение
     */
    fun toast(message: String)

    /**
     * Получить строку из ресурсов по её id
     *
     * Параметр vararg args: Any позволяет сделать форматированную строку. То есть, если в ресурсах
     * есть какая-то строка с плейсходером, куда можно подставлять другие значения, то в этом
     * аргументе мы можем их перечилить.
     */
    fun getString(messageRes: Int, vararg args: Any): String

}