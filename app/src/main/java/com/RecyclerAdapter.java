package com;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.UserList;
import com.example.databindingusingrecyclerview.R;
import com.example.databindingusingrecyclerview.databinding.RecycleRowBinding;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private static final String TAG = "RecyclerAdapter";

    List<UserList> userLists;

    public RecyclerAdapter(List<UserList> userLists) {
        this.userLists = userLists;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());


        RecycleRowBinding recycleRowBinding = RecycleRowBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(recycleRowBinding);


        //  LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        //     View view = layoutInflater.inflate(R.layout.recycle_row, parent, false);


        //  return new ViewHolder(view);


    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        UserList userList = userLists.get(position);

        // holder.bind(userList);

        holder.recycleRowBinding.setUser(userList);


    }

    @Override
    public int getItemCount() {
        return userLists.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        //   ImageView imageView;
        //  TextView textView, textView2;
        //  Button button;
        RecycleRowBinding recycleRowBinding;

        public ViewHolder(@NonNull RecycleRowBinding recycleRowBinding) {
            super(recycleRowBinding.getRoot());


            this.recycleRowBinding=recycleRowBinding;

     /*       imageView = itemView.findViewById(R.id.imageView);


            textView = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);

            button = itemView.findViewById(R.id.button);


      */
        }

   /*     public void bind(UserList userList) {

            textView.setText(userList.getName());
            textView2.setText(String.valueOf(userList.getAge()));

            button.setEnabled(userList.isActive());

            button.setText(userList.isActive() ? "Active" : "Not Active");


            Glide.with(imageView).load(userList.getImageurl()).into(imageView);

*/
        }
    }






