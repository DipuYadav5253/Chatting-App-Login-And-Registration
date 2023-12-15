package com.example.mywhatsapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mywhatsapp.Model.MessageModel;
import com.example.mywhatsapp.R;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter {


    ArrayList<MessageModel> messageModels ;

    public ChatAdapter(ArrayList<MessageModel> messageModels, Context context) {
        this.messageModels = messageModels;
        this.context = context;
    }

    Context context;

    int SENDER_VIEW_TYPE=1;
    int RECEIVER_VIEW_TYPE=2;
    @NonNull
    @Override



    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if(viewType==SENDER_VIEW_TYPE)
        {
            View view= LayoutInflater.from(context).inflate(R.layout.sample_sender,parent,false);
            return new SenderViewHolder(view);
        }
        else
        {
            View view= LayoutInflater.from(context).inflate(R.layout.sample_receiver,parent,false);
            return new ReceiverViewHolder(view);

        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       MessageModel messageModel=messageModels.get(position);
        if(holder.getClass()==SenderViewHolder.class)
        {
            ((SenderViewHolder) holder).senderMessage.setText(messageModel.getMessage());
        }
        else

        {
            ((ReceiverViewHolder) holder).receiverMessage.setText(messageModel.getMessage());
        }

    }

    @Override
    public int getItemCount() {
        return messageModels.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(messageModels.get(position).getuId().equals(FirebaseAuth.getInstance().getUid()))
            return SENDER_VIEW_TYPE;
        else
            return RECEIVER_VIEW_TYPE;

    }

    public class ReceiverViewHolder extends RecyclerView.ViewHolder {
        TextView receiverMessage,receiverTime;
        public ReceiverViewHolder(@NonNull View itemView) {
            super(itemView);

            receiverMessage=(TextView) itemView.findViewById(R.id.receiverMessage);
            receiverTime=(TextView) itemView.findViewById(R.id.receiverTime);
        }
    }

    public class SenderViewHolder extends RecyclerView.ViewHolder {
        TextView senderMessage,senderTime;
        public SenderViewHolder(@NonNull View itemView) {
            super(itemView);

            senderMessage=(TextView) itemView.findViewById(R.id.senderMessage);
            senderTime=(TextView) itemView.findViewById(R.id.senderTime);
        }
    }
}
