package cl.inacap.myapplication.adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import cl.inacap.myapplication.PersonajesFragment;
import cl.inacap.myapplication.UbicacionesFragment;

public class TabsNavPageAdapter extends FragmentStatePagerAdapter {


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "PERSONAJES";
            case 1: return "UBICACIONES";
            default: return null;
        }
    }

    public TabsNavPageAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new PersonajesFragment();
            case 1: return new UbicacionesFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
