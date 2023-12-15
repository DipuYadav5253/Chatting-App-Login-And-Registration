package com.example.mywhatsapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mywhatsapp.ChatDetailActivity;
import com.example.mywhatsapp.Model.Users;
import com.example.mywhatsapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.viewHolder> {

    ArrayList<Users> list;
    Context context;

    public UserAdapter(ArrayList<Users> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample_show_user,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
     Users users= list.get(position);
     Picasso.get().load(users.getProfilePic()).placeholder(R.drawable.profile).into(holder.image);
     holder.userName.setText(users.getUserName());

     holder.itemView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent=new Intent(context, ChatDetailActivity.class);
             intent.putExtra("UserId",users.getUserId());
             intent.putExtra("userName",users.getUserName());
             intent.putExtra("profilePic",users.getProfilePic());

             context.startActivity(intent);
         }
     });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView userName,lastMessage;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            image=(ImageView) itemView.findViewById(R.id.chatProfile);
            userName=(TextView) itemView.findViewById(R.id.userName);
            lastMessage=(TextView) itemView.findViewById(R.id.lastMessage);
        }
    }
}
