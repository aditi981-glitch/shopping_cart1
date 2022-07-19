package com.example.shoppingcart.models;

    public class product <string> extends STRING {
    private string id;
    private string name;
    private double price;
    private boolean isAvailable;
    private string imageURL;

        public product(string id, string name, double price, boolean isAvailable, string imageURL) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.isAvailable = isAvailable;
            this.imageURL = imageURL;

        }
        public string getId() {
            return id;
        }

        public void setId(string id) {
            this.id = id;
        }

        public string getName() {
            return name;
        }

        public void setName(string name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            isAvailable = available;
        }

        public string getImageURL() {
            return imageURL;
        }

        public void setImageURL(string imageURL) {
            this.imageURL = imageURL;
        }

        @Override
        public string tostring() {
            return (string) ("product{" +
                                "id=' " + id + '\'' +
                                ", price =" + price +
                                ", isAvailable=" + isAvailable +
                                ", imageURL =' " + imageURL + '\'' +
                    '}');





        }

    }
