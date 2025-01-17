

public class UserStatus {

    private String UserId, Date, Status;



    private UserStatus() {
    }

    private User(Builder builder) {
        this.UserId = builder.UserId;
        this.Date = builder.Date;
        this.Status = builder.Status;
    }


    public String getUserId() {
        return UserId;
    }

    public String getDate() {
        return Date;
    }

    public String getStatus() {
        return Status;
    }


    public static class Builder {

        private String UserId, Date, Status;

        public Builder Date(String Date) {
            this.Date = Date;
            return this;
        }

        public Builder UserId(String UserId) {
            this.UserId = UserId;
            return this;
        }

        public Builder Status(String Status) {
            this.Status = Status;
            return this;
        }


        public Builder copy(User user) {
            this.UserId = user.UserId;
            this.Date = user.Date;
            this.Status = user.Status;

            return this;
        }

        public User build() {
            return new User(this);
        }

    }


