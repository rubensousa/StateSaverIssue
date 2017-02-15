package com.github.rubensousa.statesaverissue;


import android.support.v4.app.Fragment;

import com.evernote.android.state.State;

public abstract class BaseFragment<V extends BaseContract.View<P>,
        P extends BaseContract.Presenter<V>> extends Fragment {

    @State
    boolean state;
}

