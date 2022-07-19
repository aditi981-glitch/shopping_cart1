package com.example.shoppingcart.adapters;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class shoplistadapter<Product> extends listadapter <Product,shoplistadapter, ShopViewHolder> {
    class ShopViewHolder extends RecyclerView.ViewHolder {
        public ShopViewHolder(@NonNull View itemview) {
            super(itemview);
        }
    }
}
