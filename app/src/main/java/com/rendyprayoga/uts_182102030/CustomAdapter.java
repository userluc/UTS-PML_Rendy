package com.rendyprayoga.uts_182102030;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rendyprayoga.uts_182102030.model.User;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<User> mDataList;
    private Context context;
    private LayoutInflater mInflater;


    public CustomAdapter(Context context, List<User> dataList){
        mInflater = LayoutInflater.from(context);
        this.mDataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        public final TextView idTextView;
        public final TextView usernameTextView;
        public final TextView nameTextView;
        public final TextView emailTextView;
        final CustomAdapter mAdapter;

        public CustomViewHolder(View itemView, CustomAdapter adapter){
            super(itemView);
            idTextView = (TextView)itemView.findViewById(R.id.user_id);
            usernameTextView = (TextView)itemView.findViewById(R.id.username);
            nameTextView = (TextView)itemView.findViewById(R.id.name);
            emailTextView = (TextView)itemView.findViewById(R.id.email);
            this.mAdapter = adapter;
        }

    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView =mInflater.inflate(R.layout.list_user, parent, false);
        return new CustomViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        String currentId = String.valueOf(mDataList.get(position).getId());
        holder.idTextView.setText("ID : " + currentId);
        String currentUsername = mDataList.get(position).getUsername();
        holder.usernameTextView.setText("Username : " + currentUsername);
        String currentName = mDataList.get(position).getName();
        holder.nameTextView.setText(currentName);
        String currentEmail = mDataList.get(position).getEmail();
        holder.emailTextView.setText(currentEmail);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }


}