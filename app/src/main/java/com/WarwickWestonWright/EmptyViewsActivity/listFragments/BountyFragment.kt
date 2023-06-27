package com.WarwickWestonWright.EmptyViewsActivity.listFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.WarwickWestonWright.EmptyViewsActivity.R
import com.WarwickWestonWright.EmptyViewsActivity.listFragments.placeholder.PlaceholderContent

/**
 * A fragment representing a list of Items.
 */
class BountyFragment : Fragment() {

    private lateinit var rootView: RecyclerView

/*    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //arguments?.let {}
    }*/

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        rootView = inflater.inflate(R.layout.fragment_item_list, container, false) as RecyclerView

        with(rootView) {
            LinearLayoutManager(context)
            adapter = BountyAdapter(PlaceholderContent.ITEMS)
        }
        return rootView
    }

}