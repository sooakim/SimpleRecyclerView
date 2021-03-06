package com.dino.simplerecyclerview.mvp

import com.dino.simplerecyclerview.model.VectorAsset

class MvpPresenter(private val view: MvpContract.View) : MvpContract.Presenter {

    override fun createItem() {
        val items =
            VectorAsset.values()
                .map { it.toItem() }
                .toMutableList()
                .shuffled()
        view.showItem(items)
    }
}