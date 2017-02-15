package com.github.rubensousa.statesaverissue;


public interface MvpView<P extends MvpPresenter> {
    P getPresenter();
}
