package com.example.mywhatsapp.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mywhatsapp.Fragments.CallFragment;
import com.example.mywhatsapp.Fragments.ChatFragment;
import com.example.mywhatsapp.Fragments.StatusFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {
    public FragmentsAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    String title[]= {"Chats", "Status", "Calls"};
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1: return new StatusFragment();
            case 2: return new CallFragment();
            case 0:
            default: return new ChatFragment();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return title[position];
    }
}
