package com.github.rubensousa.statesaverissue;


public interface BaseContract {

    interface View<P extends Presenter> extends MvpView<P> {

    }

    interface Presenter<V extends View> extends MvpPresenter<V> {

    }

}
