public class Staff_Information {
        protected String fullName;
        protected int idNumber;
        protected String email;
        
        public Staff_Information()
        {
            fullName ="";
            idNumber =0;
            email ="";
        }

        // getters and setters :

        public String getFullName() {
            return fullName;
        }
        public void setFullName(String fn) {
            this.fullName = fn;
        }
        public int getIdNumber(){
            return idNumber;
        }
        public void setIdNumber(int rn) {
            this.idNumber = rn;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String em) {
            this.email = em;
        }
}