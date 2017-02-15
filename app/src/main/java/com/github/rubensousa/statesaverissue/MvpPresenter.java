package com.github.rubensousa.statesaverissue;


public interface MvpPresenter<V extends MvpView> {
    void attach(V view);
}
