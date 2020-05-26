struct param
{   
    char* name;
    int voterid;
};

program VOTECLIENT_PROG
{
        version VOTECLIENT_VERS
        {
        string ZEROIZE() = 1;
                string ADDVOTER(int) = 2;
        string VOTEFOR(param) = 3;
        string LISTCANDIDATES() = 4;
        int VOTECOUNT(string) = 5;
        } = 1;
} = 0x2345111;
