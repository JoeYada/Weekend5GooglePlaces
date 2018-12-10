package com.example.joe.weekend5googleplaces.ui.hompage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.joe.weekend5googleplaces.R
import com.example.joe.weekend5googleplaces.base.BaseActivity
import com.example.joe.weekend5googleplaces.models.PlaceData
import com.example.joe.weekend5googleplaces.models.PlaceDataResponse

class MainActivity: BaseActivity<MainContract.Presenter>(), MainContract.View {
    lateinit var presenter: MainPresenter
    var placeList = ArrayList<PlaceData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        placeList = ArrayList()

        presenter = MainPresenter(this)
        presenter.onCreate()
    }
    override fun getViewPresenter(): MainContract.Presenter = presenter

    override fun init() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showPlaces(places: PlaceDataResponse) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
