package ma.swblockspreview;

public class Constants {
    // 🤓
    public static final String SAMPLE_BLOCKS_STR =
            "{\"color\":-11899692,\"id\":\"99000020\",\"nextBlock\":99000021,\"opCode\":\"setVisible\",\"parameters\":[\"progressbar1\",\"GONE\"],\"spec\":\"%m.view setVisible %m.visible\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-11899692,\"id\":\"99000021\",\"nextBlock\":99000010,\"opCode\":\"setVisible\",\"parameters\":[\"button1\",\"VISIBLE\"],\"spec\":\"%m.view setVisible %m.visible\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1988310,\"id\":\"99000010\",\"nextBlock\":-1,\"opCode\":\"ifElse\",\"parameters\":[\"@99000011\"],\"spec\":\"if %b then\",\"subStack1\":99000050,\"subStack2\":99000022,\"type\":\"e\",\"typeName\":\"\"}\n" +
            "{\"color\":-7711273,\"id\":\"99000011\",\"nextBlock\":-1,\"opCode\":\"getArg\",\"parameters\":[],\"spec\":\"success\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"b\",\"typeName\":\"\"}\n" +
            "{\"color\":-1988310,\"id\":\"99000050\",\"nextBlock\":-1,\"opCode\":\"ifElse\",\"parameters\":[\"@99000024\"],\"spec\":\"if %b then\",\"subStack1\":99000025,\"subStack2\":99000047,\"type\":\"e\",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000024\",\"nextBlock\":-1,\"opCode\":\"getVar\",\"parameters\":[],\"spec\":\"justregistering\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"b\",\"typeName\":\"\"}\n" +
            "{\"color\":-7711273,\"id\":\"99000025\",\"nextBlock\":99000026,\"opCode\":\"definedFunc\",\"parameters\":[],\"spec\":\"hideKeyboard\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000026\",\"nextBlock\":99000028,\"opCode\":\"setVarString\",\"parameters\":[\"key\",\"@99000065\"],\"spec\":\"set %m.varStr to %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000065\",\"nextBlock\":-1,\"opCode\":\"firebaseauthGetUid\",\"parameters\":[],\"spec\":\"FirebaseAuth getUid\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000028\",\"nextBlock\":99000029,\"opCode\":\"mapCreateNew\",\"parameters\":[\"registerData\"],\"spec\":\"%m.varMap create new map\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000029\",\"nextBlock\":99000031,\"opCode\":\"mapPut\",\"parameters\":[\"registerData\",\"name\",\"@99000030\"],\"spec\":\"%m.varMap put key %s value %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000030\",\"nextBlock\":-1,\"opCode\":\"getVar\",\"parameters\":[],\"spec\":\"temp\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000031\",\"nextBlock\":99000033,\"opCode\":\"mapPut\",\"parameters\":[\"registerData\",\"mail\",\"@99000032\"],\"spec\":\"%m.varMap put key %s value %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000032\",\"nextBlock\":-1,\"opCode\":\"getVar\",\"parameters\":[],\"spec\":\"temp2\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000033\",\"nextBlock\":99000035,\"opCode\":\"mapPut\",\"parameters\":[\"registerData\",\"key\",\"@99000034\"],\"spec\":\"%m.varMap put key %s value %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000034\",\"nextBlock\":-1,\"opCode\":\"getVar\",\"parameters\":[],\"spec\":\"key\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000035\",\"nextBlock\":99000036,\"opCode\":\"mapPut\",\"parameters\":[\"registerData\",\"rank\",\"@99000045\"],\"spec\":\"%m.varMap put key %s value %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000045\",\"nextBlock\":-1,\"opCode\":\"getVar\",\"parameters\":[],\"spec\":\"DEFAULT_RANK\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000036\",\"nextBlock\":99000037,\"opCode\":\"mapPut\",\"parameters\":[\"registerData\",\"about\",\"@99000046\"],\"spec\":\"%m.varMap put key %s value %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000046\",\"nextBlock\":-1,\"opCode\":\"getVar\",\"parameters\":[],\"spec\":\"DEFAULT_ABOUT\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000037\",\"nextBlock\":99000038,\"opCode\":\"mapPut\",\"parameters\":[\"registerData\",\"profile_picture\",\"null\"],\"spec\":\"%m.varMap put key %s value %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000038\",\"nextBlock\":99000088,\"opCode\":\"mapPut\",\"parameters\":[\"registerData\",\"uid\",\"@99000042\"],\"spec\":\"%m.varMap put key %s value %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000042\",\"nextBlock\":-1,\"opCode\":\"firebaseauthGetUid\",\"parameters\":[],\"spec\":\"FirebaseAuth getUid\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000088\",\"nextBlock\":99000039,\"opCode\":\"fileSetData\",\"parameters\":[\"data\",\"username\",\"@99000089\"],\"spec\":\"%m.file setData key %s value %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000089\",\"nextBlock\":-1,\"opCode\":\"getVar\",\"parameters\":[],\"spec\":\"temp\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000039\",\"nextBlock\":99000059,\"opCode\":\"firebaseAdd\",\"parameters\":[\"f_db\",\"@99000040\",\"registerData\"],\"spec\":\"%m.firebase add key %s value %m.varMap\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000040\",\"nextBlock\":-1,\"opCode\":\"getVar\",\"parameters\":[],\"spec\":\"key\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000059\",\"nextBlock\":99000051,\"opCode\":\"addSourceDirectly\",\"parameters\":[\"f_auth.getCurrentUser().sendEmailVerification().addOnCompleteListener(new OnCompleteListener\\u003cVoid\\u003e() { \\n@Override\\npublic void onComplete(@android.support.annotation.NonNull Task\\u003cVoid\\u003e task) {\\nif (task.isSuccessful()) {\"],\"spec\":\"add source directly %s.inputOnly\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000051\",\"nextBlock\":99000052,\"opCode\":\"firebaseauthSignOutUser\",\"parameters\":[],\"spec\":\"FirebaseAuth signOut\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-7711273,\"id\":\"99000052\",\"nextBlock\":99000053,\"opCode\":\"definedFunc\",\"parameters\":[\"Registered successfully. Please check your email for verification\"],\"spec\":\"createSnackBar %s.message\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1147626,\"id\":\"99000053\",\"nextBlock\":99000055,\"opCode\":\"setVarBoolean\",\"parameters\":[\"LoginMode\",\"@99000054\"],\"spec\":\"set %m.varBool to %b\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000054\",\"nextBlock\":-1,\"opCode\":\"true\",\"parameters\":[],\"spec\":\"true\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"b\",\"typeName\":\"\"}\n" +
            "{\"color\":-7711273,\"id\":\"99000055\",\"nextBlock\":99000043,\"opCode\":\"definedFunc\",\"parameters\":[],\"spec\":\"refreshMode\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-11899692,\"id\":\"99000043\",\"nextBlock\":99000044,\"opCode\":\"setVisible\",\"parameters\":[\"progressbar1\",\"GONE\"],\"spec\":\"%m.view setVisible %m.visible\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-11899692,\"id\":\"99000044\",\"nextBlock\":99000060,\"opCode\":\"setVisible\",\"parameters\":[\"button1\",\"VISIBLE\"],\"spec\":\"%m.view setVisible %m.visible\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000060\",\"nextBlock\":99000061,\"opCode\":\"addSourceDirectly\",\"parameters\":[\"} else {\"],\"spec\":\"add source directly %s.inputOnly\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000061\",\"nextBlock\":-1,\"opCode\":\"addSourceDirectly\",\"parameters\":[\"}}});\"],\"spec\":\"add source directly %s.inputOnly\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000047\",\"nextBlock\":99000083,\"opCode\":\"addSourceDirectly\",\"parameters\":[\"if (f_auth.getCurrentUser().isEmailVerified()) {\"],\"spec\":\"add source directly %s.inputOnly\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-1988310,\"id\":\"99000083\",\"nextBlock\":99000049,\"opCode\":\"ifElse\",\"parameters\":[\"@99000084\"],\"spec\":\"if %b then\",\"subStack1\":99000086,\"subStack2\":99000015,\"type\":\"e\",\"typeName\":\"\"}\n" +
            "{\"color\":-3384542,\"id\":\"99000084\",\"nextBlock\":-1,\"opCode\":\"containListStr\",\"parameters\":[\"banned\",\"@99000085\"],\"spec\":\"%m.listStr contains %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"b\",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000085\",\"nextBlock\":-1,\"opCode\":\"firebaseauthGetUid\",\"parameters\":[],\"spec\":\"FirebaseAuth getUid\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-7711273,\"id\":\"99000086\",\"nextBlock\":99000087,\"opCode\":\"definedFunc\",\"parameters\":[\"Your account has been banned. Contact us if you think it\\u0027s mistake.\"],\"spec\":\"createSnackBar %s.message\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000087\",\"nextBlock\":-1,\"opCode\":\"firebaseauthSignOutUser\",\"parameters\":[],\"spec\":\"FirebaseAuth signOut\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000015\",\"nextBlock\":99000012,\"opCode\":\"doToast\",\"parameters\":[\"@99000017\"],\"spec\":\"Toast %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000017\",\"nextBlock\":-1,\"opCode\":\"stringJoin\",\"parameters\":[\"Welcome back, \",\"@99000016\"],\"spec\":\"join %s and %s\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000016\",\"nextBlock\":-1,\"opCode\":\"firebaseauthGetCurrentUser\",\"parameters\":[],\"spec\":\"FirebaseAuth getEmail\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000012\",\"nextBlock\":99000013,\"opCode\":\"intentSetScreen\",\"parameters\":[\"intent\",\"HomeActivity\"],\"spec\":\"%m.intent setScreen %m.activity\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000013\",\"nextBlock\":99000048,\"opCode\":\"startActivity\",\"parameters\":[\"intent\"],\"spec\":\"StartActivity %m.intent\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000048\",\"nextBlock\":-1,\"opCode\":\"addSourceDirectly\",\"parameters\":[\"finish();\"],\"spec\":\"add source directly %s.inputOnly\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000049\",\"nextBlock\":99000058,\"opCode\":\"addSourceDirectly\",\"parameters\":[\"} else {\"],\"spec\":\"add source directly %s.inputOnly\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-13851166,\"id\":\"99000058\",\"nextBlock\":99000064,\"opCode\":\"firebaseauthSignOutUser\",\"parameters\":[],\"spec\":\"FirebaseAuth signOut\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-7711273,\"id\":\"99000064\",\"nextBlock\":99000056,\"opCode\":\"definedFunc\",\"parameters\":[\"Please verify your email address\"],\"spec\":\"createSnackBar %s.message\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-10701022,\"id\":\"99000056\",\"nextBlock\":-1,\"opCode\":\"addSourceDirectly\",\"parameters\":[\"}\"],\"spec\":\"add source directly %s.inputOnly\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-7711273,\"id\":\"99000022\",\"nextBlock\":-1,\"opCode\":\"definedFunc\",\"parameters\":[\"@99000019\"],\"spec\":\"createSnackBar %s.message\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\" \",\"typeName\":\"\"}\n" +
            "{\"color\":-7711273,\"id\":\"99000019\",\"nextBlock\":-1,\"opCode\":\"getArg\",\"parameters\":[],\"spec\":\"errorMessage\",\"subStack1\":-1,\"subStack2\":-1,\"type\":\"s\",\"typeName\":\"\"}\n";
}