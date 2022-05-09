package com.example.dagangdaging.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.dagangdaging.AddChart;
import com.example.dagangdaging.DetailProduk;
import com.example.dagangdaging.Notifikasi;
import com.example.dagangdaging.R;
import com.example.dagangdaging.Kategori.DagingSteak;
import com.example.dagangdaging.Kategori.DagingOlahan;
import com.example.dagangdaging.Kategori.PaketDaging;
import com.example.dagangdaging.Kategori.BumbuDaging;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentHome#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentHome extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentHome() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentHome.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentHome newInstance(String param1, String param2) {
        FragmentHome fragment = new FragmentHome();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //inflater.inflate(R.layout.fragment_home, container, false);

        //kategori
        CardView katdagingsteak = (CardView) view.findViewById(R.id.cvdagingsteak);
        CardView katdagingolahan = (CardView) view.findViewById(R.id.cvdagingolahan);
        CardView katpaketdaging = (CardView) view.findViewById(R.id.cvpaketdaging);
        CardView katbumbudapur = (CardView) view.findViewById(R.id.cvbumbudapur);

        //popular item
        CardView popitem1 = (CardView) view.findViewById(R.id.cvpop1);
        CardView popitem2 = (CardView) view.findViewById(R.id.cvpop2);
        CardView popitem3 = (CardView) view.findViewById(R.id.cvpop3);
        CardView popitem4 = (CardView) view.findViewById(R.id.cvpop4);
        CardView popitem5 = (CardView) view.findViewById(R.id.cvpop5);
        CardView popitem6 = (CardView) view.findViewById(R.id.cvpop6);

        //header
        ImageButton addchart = (ImageButton) view.findViewById(R.id.addchart);
        ImageButton notif = (ImageButton) view.findViewById(R.id.notif);

        katdagingsteak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), DagingSteak.class);
                startActivity(In);
            }
        });
        katdagingolahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), DagingOlahan.class);
                startActivity(In);
            }
        });
        katpaketdaging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), PaketDaging.class);
                startActivity(In);
            }
        });
        katbumbudapur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), BumbuDaging.class);
                startActivity(In);
            }
        });
        popitem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), DetailProduk.class);
                startActivity(In);
            }
        });
        popitem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), DetailProduk.class);
                startActivity(In);
            }
        });
        popitem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), DetailProduk.class);
                startActivity(In);
            }
        });
        popitem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), DetailProduk.class);
                startActivity(In);
            }
        });
        popitem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), DetailProduk.class);
                startActivity(In);
            }
        });
        popitem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), DetailProduk.class);
                startActivity(In);
            }
        });
        addchart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), AddChart.class);
                startActivity(In);
            }
        });
        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent In = new Intent(getActivity(), Notifikasi.class);
                startActivity(In);
            }
        });
        return view;
    }
}