package com.mapp.recyclerviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//Custom adapter created and extended from RecyclerView.Adapter. It needs a ViewHolder to create the cells.
public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder>{

    //The constructor is just necessary if the data is comming from other place as DB.
    public AdapterList(){

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Attach the cell to the view holder
        Context ctx = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View contactView = inflater.inflate(R.layout.cell_item,parent,false);
        ViewHolder hold = new ViewHolder(contactView);

        return hold;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Set the information in the cell
        holder.bindInfo(position);
    }

    //Number of cells
    @Override
    public int getItemCount() {
        return 10;
    }

    //Custom view holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView txtCard;

        //Set the information to the cell
        public void bindInfo(int position){
         txtCard.setText("ELEMENT "+String.valueOf(position));
        }

        //Constructor to find the view of the text inside the cell.
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtCard=(TextView)itemView.findViewById(R.id.textCard);
        }
    }
}
