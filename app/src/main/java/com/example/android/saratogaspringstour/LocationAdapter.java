package com.example.android.saratogaspringstour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Create a new LocationAdapter object
     *
     * @param context   Current context that the PlaceAdapter is being created in
     * @param locations List of Place objects to be displayed
     */
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the (@link Location) object located at this position in the list
        Location currentLocation = getItem(position);

        TextView nameText = listItemView.findViewById(R.id.location_name);
        nameText.setText(currentLocation.getName());

        TextView addressText = listItemView.findViewById(R.id.location_address);
        addressText.setText(currentLocation.getAddress());

        if (currentLocation.getDetails() != null) {
            TextView detailsText = listItemView.findViewById(R.id.location_details);
            detailsText.setVisibility(View.VISIBLE);
            detailsText.setText(currentLocation.getDetails());
        }

        if (currentLocation.getLocationImage() != 0) {
            ImageView locationImage = listItemView.findViewById(R.id.location_image);
            locationImage.setVisibility(View.VISIBLE);
            locationImage.setImageResource(currentLocation.getLocationImage());
        }

        return listItemView;
    }
}
