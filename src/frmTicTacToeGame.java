/*
 Created by Jay Dadhiala
 Nov 8, 2020
 This program is a game of Tic-Tac-Toe. 
It will involve 2 players taking turns to place their assigned letter,
an “o” or an “x”, on a 3x3 grid until one person creates a line of 3 of their letter,
or nobody can make any more moves.
 */

public class frmTicTacToeGame extends javax.swing.JFrame {
    //Variables declaired when the program starts:
    String [] userChoices = new String [9];
    String [] spaceUsed = new String [9];    
    String winner;
    String firstSymbol = "";
    String secondSymbol;
    String mostRecentSym;
    int turnsPassed = 1;
    int totalTurnsPassed = 0;
    int gamesWonX = 0;
    int gamesWonO = 0;
    int gamesTied = 0;
    final int NUM_FOR_TIE = 9;
    boolean proceed;
    boolean isXsTurn;
    
    /**
     * Creates new form frmTicTacToeGame
     */
    public frmTicTacToeGame() {
        initComponents();
    }
    
    /*
    whosTurn
    This method finds whether "x" or "o" are meant to be placed during a turn.
    Parameter: String, Int
    Returns: boolean
   */
    public static boolean whosTurn (String firstSym, int turnsPassed)
    {
        boolean isX = true;
        
        if (firstSym.equalsIgnoreCase("x") && turnsPassed % 2 == 0)
        {
            isX = false;
        }
        else if (firstSym.equalsIgnoreCase("x") && turnsPassed % 2 == 1)
        {
            isX = true;
        }
        else
        {
            //nothing
        }
        
        if (firstSym.equalsIgnoreCase("o") && turnsPassed % 2 == 0)
        {
            isX = true;
        }
        else if (firstSym.equalsIgnoreCase("o") && turnsPassed % 2 == 1)
        {
            isX = false;
        }
        else
        {
            //nothing
        }
        
        return (isX);      
    }
    
    /*
    lineOfThree
    This method checks if a player has make a line of three of one symbol.
    Parameter: String, String, String, String, String, String, String, String, String
    Returns: String
   */
    public static String lineOfThree (String g1, String g2, String g3, String g4, String g5, String g6, String g7, String g8, String g9) 
    // "g" represents spaces of a grid from left to right, top to bottom.
    {
        String whoWins = "";
        
        //For the player playing as "x":
        //For horizontal lines:
        if (g1.equalsIgnoreCase("x") && g2.equalsIgnoreCase("x") && g3.equalsIgnoreCase("x"))
        {
            whoWins = "\"x\"";
        }
        else if (g4.equalsIgnoreCase("x") && g5.equalsIgnoreCase("x") && g6.equalsIgnoreCase("x"))
        {
            whoWins = "\"x\"";
        }
        else if (g7.equalsIgnoreCase("x") && g8.equalsIgnoreCase("x") && g9.equalsIgnoreCase("x"))
        {
            whoWins = "\"x\"";
        }
        //For vertical lines:
        else if (g1.equalsIgnoreCase("x") && g4.equalsIgnoreCase("x") && g7.equalsIgnoreCase("x"))
        {
            whoWins = "\"x\"";
        }
        else if (g2.equalsIgnoreCase("x") && g5.equalsIgnoreCase("x") && g8.equalsIgnoreCase("x"))
        {
            whoWins = "\"x\"";
        }
        else if (g3.equalsIgnoreCase("x") && g6.equalsIgnoreCase("x") && g9.equalsIgnoreCase("x"))
        {
            whoWins = "\"x\"";
        }
        //For diagonal lines:
        else if (g1.equalsIgnoreCase("x") && g5.equalsIgnoreCase("x") && g9.equalsIgnoreCase("x"))
        {
            whoWins = "\"x\"";
        }
        else if (g3.equalsIgnoreCase("x") && g5.equalsIgnoreCase("x") && g7.equalsIgnoreCase("x"))
        {
            whoWins = "\"x\"";
        }
        else
        {
            //nothing
        }
        
        //For the player playing as "o":
        //For horizontal lines:
        if (g1.equalsIgnoreCase("o") && g2.equalsIgnoreCase("o") && g3.equalsIgnoreCase("o"))
        {
            whoWins = "\"o\"";
        }
        else if (g4.equalsIgnoreCase("o") && g5.equalsIgnoreCase("o") && g6.equalsIgnoreCase("o"))
        {
            whoWins = "\"o\"";
        }
        else if (g7.equalsIgnoreCase("o") && g8.equalsIgnoreCase("o") && g9.equalsIgnoreCase("o"))
        {
            whoWins = "\"o\"";
        }
        //For vertical lines:
        else if (g1.equalsIgnoreCase("o") && g4.equalsIgnoreCase("o") && g7.equalsIgnoreCase("o"))
        {
            whoWins = "\"o\"";
        }
        else if (g2.equalsIgnoreCase("o") && g5.equalsIgnoreCase("o") && g8.equalsIgnoreCase("o"))
        {
            whoWins = "\"o\"";
        }
        else if (g3.equalsIgnoreCase("o") && g6.equalsIgnoreCase("o") && g9.equalsIgnoreCase("o"))
        {
            whoWins = "\"o\"";
        }
        //For diagonal lines:
        else if (g1.equalsIgnoreCase("o") && g5.equalsIgnoreCase("o") && g9.equalsIgnoreCase("o"))
        {
            whoWins = "\"o\"";
        }
        else if (g3.equalsIgnoreCase("o") && g5.equalsIgnoreCase("o") && g7.equalsIgnoreCase("o"))
        {
            whoWins = "\"o\"";
        }
        else
        {
            //nothing   
        }
     
        return (whoWins);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabFullGame = new javax.swing.JTabbedPane();
        panTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblGameExplain1 = new javax.swing.JLabel();
        lblGameExplain2 = new javax.swing.JLabel();
        lblXOImage1 = new javax.swing.JLabel();
        lblXOImage2 = new javax.swing.JLabel();
        lblXOImage3 = new javax.swing.JLabel();
        lblXOImage4 = new javax.swing.JLabel();
        lblGameExplain3 = new javax.swing.JLabel();
        lblGameExplain4 = new javax.swing.JLabel();
        lblStartMessage = new javax.swing.JLabel();
        lblOr = new javax.swing.JLabel();
        lblStartMessage1 = new javax.swing.JLabel();
        panInstuct = new javax.swing.JPanel();
        lblInstuctTitle = new javax.swing.JLabel();
        lblInstruct1 = new javax.swing.JLabel();
        lblInstruct2 = new javax.swing.JLabel();
        lblInstruct3 = new javax.swing.JLabel();
        lblInstruct4 = new javax.swing.JLabel();
        lblInstruct5 = new javax.swing.JLabel();
        lblInstruct6 = new javax.swing.JLabel();
        lblInstruct7 = new javax.swing.JLabel();
        lblInstruct8 = new javax.swing.JLabel();
        lblInstruct9 = new javax.swing.JLabel();
        lblInstruct10 = new javax.swing.JLabel();
        lblInstruct11 = new javax.swing.JLabel();
        lblInstruct12 = new javax.swing.JLabel();
        lblInstruct13 = new javax.swing.JLabel();
        lblInstruct14 = new javax.swing.JLabel();
        lblInstruct15 = new javax.swing.JLabel();
        lblInstruct16 = new javax.swing.JLabel();
        lblPaperQuillImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panGame = new javax.swing.JPanel();
        btnFinishTurn = new javax.swing.JButton();
        lblPlayerTurn = new javax.swing.JLabel();
        txtGrid8 = new javax.swing.JTextField();
        txtGrid9 = new javax.swing.JTextField();
        txtGrid7 = new javax.swing.JTextField();
        txtGrid4 = new javax.swing.JTextField();
        txtGrid3 = new javax.swing.JTextField();
        txtGrid2 = new javax.swing.JTextField();
        txtGrid1 = new javax.swing.JTextField();
        txtGrid6 = new javax.swing.JTextField();
        txtGrid5 = new javax.swing.JTextField();
        lblTurnsPassRound = new javax.swing.JLabel();
        lblTurnsPassRoundAns = new javax.swing.JLabel();
        lblGameMessage = new javax.swing.JLabel();
        btnNewMatch = new javax.swing.JButton();
        lblInstruct17 = new javax.swing.JLabel();
        lblInstruct18 = new javax.swing.JLabel();
        lblInstruct19 = new javax.swing.JLabel();
        panStats = new javax.swing.JPanel();
        lblStatsTitle = new javax.swing.JLabel();
        lblTotalTurnsPassed = new javax.swing.JLabel();
        lblOWins = new javax.swing.JLabel();
        lblXWins = new javax.swing.JLabel();
        lblTies = new javax.swing.JLabel();
        lblTotalTurnsPassedAns = new javax.swing.JLabel();
        lbOWinsAns = new javax.swing.JLabel();
        lblXWinsAns = new javax.swing.JLabel();
        lblTiesAns = new javax.swing.JLabel();
        lblStatsImage = new javax.swing.JLabel();
        lblMatchesPlayed = new javax.swing.JLabel();
        lblMatchesPlayedAns = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTitle.setBackground(new java.awt.Color(0, 51, 153));

        lblTitle.setFont(new java.awt.Font("Antonio", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Tic-Tac-Toe");

        lblGameExplain1.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblGameExplain1.setForeground(new java.awt.Color(255, 255, 255));
        lblGameExplain1.setText("Wecome to Tic-Tac-Toe! In this game, 2 players take turns to place ");

        lblGameExplain2.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblGameExplain2.setForeground(new java.awt.Color(255, 255, 255));
        lblGameExplain2.setText("their chosen symbol, an “o” or an “x”, on a 3x3 grid. The player who ");

        lblXOImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/X and O (1).png"))); // NOI18N

        lblXOImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/X and O (1).png"))); // NOI18N

        lblXOImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/X and O (1).png"))); // NOI18N

        lblXOImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/X and O (1).png"))); // NOI18N

        lblGameExplain3.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblGameExplain3.setForeground(new java.awt.Color(255, 255, 255));
        lblGameExplain3.setText("is able to make a horizontal, vertical, or diagonal line before the other ");

        lblGameExplain4.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblGameExplain4.setForeground(new java.awt.Color(255, 255, 255));
        lblGameExplain4.setText("wins the game. ");

        lblStartMessage.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        lblStartMessage.setForeground(new java.awt.Color(255, 102, 102));
        lblStartMessage.setText("Press the \"Game\" tab to start!");

        lblOr.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        lblOr.setForeground(new java.awt.Color(0, 204, 0));
        lblOr.setText("OR");

        lblStartMessage1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        lblStartMessage1.setForeground(new java.awt.Color(255, 102, 102));
        lblStartMessage1.setText("Press the \"Instructions\" tab to learn how to play!");

        javax.swing.GroupLayout panTitleLayout = new javax.swing.GroupLayout(panTitle);
        panTitle.setLayout(panTitleLayout);
        panTitleLayout.setHorizontalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblStartMessage1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panTitleLayout.createSequentialGroup()
                .addGroup(panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTitleLayout.createSequentialGroup()
                        .addGroup(panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panTitleLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblXOImage4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblXOImage3)
                                .addGap(18, 18, 18)
                                .addComponent(lblTitle)
                                .addGap(18, 18, 18)
                                .addComponent(lblXOImage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblXOImage2))
                            .addGroup(panTitleLayout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(lblStartMessage))
                            .addGroup(panTitleLayout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(lblOr)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTitleLayout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addGroup(panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGameExplain1)
                            .addComponent(lblGameExplain2)
                            .addComponent(lblGameExplain3)
                            .addComponent(lblGameExplain4))))
                .addContainerGap())
        );
        panTitleLayout.setVerticalGroup(
            panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTitleLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(lblXOImage1)
                    .addComponent(lblXOImage2)
                    .addComponent(lblXOImage3)
                    .addComponent(lblXOImage4))
                .addGap(28, 28, 28)
                .addComponent(lblGameExplain1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGameExplain2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGameExplain3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGameExplain4)
                .addGap(39, 39, 39)
                .addComponent(lblStartMessage)
                .addGap(18, 18, 18)
                .addComponent(lblOr)
                .addGap(18, 18, 18)
                .addComponent(lblStartMessage1)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        tabFullGame.addTab("Title Screen", panTitle);

        panInstuct.setBackground(new java.awt.Color(0, 51, 153));

        lblInstuctTitle.setFont(new java.awt.Font("Antonio", 1, 24)); // NOI18N
        lblInstuctTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblInstuctTitle.setText("Instuctions:");

        lblInstruct1.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct1.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct1.setText("You can visit all portions of this game at all times by pressing the tabs at the");

        lblInstruct2.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct2.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct2.setText("top of this window.");

        lblInstruct3.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct3.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct3.setText("When starting the game, choose which player is going to go first among two ");

        lblInstruct4.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct4.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct4.setText("players. You can then press the “Game” tab at the top of this window to access");

        lblInstruct5.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct5.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct5.setText("the game. Player 1 goes first, and can place an “o” or an “x” anywhere on the grid.");

        lblInstruct6.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct6.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct6.setText("Player 2 then follows. Whatever Player 1 first picks in the first match will be their");

        lblInstruct7.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct7.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct7.setText("symbol for the rest of the game, and Player 2 uses the remaining symbol. When");

        lblInstruct8.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct8.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct8.setText("the player has finished their turn, they must press the “Finish Turn” button to ");

        lblInstruct9.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct9.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct9.setText("proceed to the next turn. Messages will appear above the game board to guide you ");

        lblInstruct10.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct10.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct10.setText("through the process. To start a new match, press the “Start New Match” button at ");

        lblInstruct11.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct11.setForeground(new java.awt.Color(255, 255, 255));
        lblInstruct11.setText("the bottom right corner of the \"Game\" tab. To view stats, press the “Statistics” tab.");

        lblInstruct12.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct12.setForeground(new java.awt.Color(255, 102, 102));
        lblInstruct12.setText("Note: Do not remove any symbols you have already placed unless it is an invalid");

        lblInstruct13.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct13.setForeground(new java.awt.Color(255, 102, 102));
        lblInstruct13.setText("input. Also, if you get an unexpected “invalid Input” error, check if you accidentally ");

        lblInstruct14.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct14.setForeground(new java.awt.Color(255, 102, 102));
        lblInstruct14.setText("typed more than one symbol in a box on the game board. This can be checked by ");

        lblInstruct15.setFont(new java.awt.Font("BIZ UDPGothic", 1, 12)); // NOI18N
        lblInstruct15.setForeground(new java.awt.Color(255, 102, 102));
        lblInstruct15.setText("highlighting the symbol you just placed and moving your mouse to the left. ");

        lblInstruct16.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblInstruct16.setForeground(new java.awt.Color(255, 204, 0));
        lblInstruct16.setText("Have Fun!");

        lblPaperQuillImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Paper and Quill.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Paper and Quill Fliped.png"))); // NOI18N

        javax.swing.GroupLayout panInstuctLayout = new javax.swing.GroupLayout(panInstuct);
        panInstuct.setLayout(panInstuctLayout);
        panInstuctLayout.setHorizontalGroup(
            panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInstuctLayout.createSequentialGroup()
                .addGroup(panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblInstuctTitle))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstruct5)
                            .addComponent(lblInstruct4)))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstruct3)
                            .addComponent(lblInstruct2)))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstruct1)
                            .addComponent(lblInstruct6)))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstruct7)
                            .addComponent(lblInstruct8)))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstruct9)
                            .addComponent(lblInstruct10)))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInstruct11)
                            .addComponent(lblInstruct12)))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInstruct13))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInstruct14))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblInstruct15))
                    .addGroup(panInstuctLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)
                        .addGap(78, 78, 78)
                        .addComponent(lblInstruct16)
                        .addGap(83, 83, 83)
                        .addComponent(lblPaperQuillImage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panInstuctLayout.setVerticalGroup(
            panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInstuctLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblInstuctTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruct1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruct3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstruct12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct15)
                .addGap(18, 18, 18)
                .addGroup(panInstuctLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPaperQuillImage)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panInstuctLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblInstruct16)
                        .addGap(40, 40, 40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabFullGame.addTab("Instuctions", panInstuct);

        panGame.setBackground(new java.awt.Color(0, 51, 153));

        btnFinishTurn.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        btnFinishTurn.setText("Finish Turn");
        btnFinishTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishTurnActionPerformed(evt);
            }
        });

        lblPlayerTurn.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 18)); // NOI18N
        lblPlayerTurn.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerTurn.setText("Player 1 goes first.");

        txtGrid8.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        txtGrid9.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        txtGrid7.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        txtGrid4.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        txtGrid3.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        txtGrid2.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        txtGrid1.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        txtGrid6.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        txtGrid5.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N

        lblTurnsPassRound.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        lblTurnsPassRound.setForeground(new java.awt.Color(255, 255, 255));
        lblTurnsPassRound.setText("Turns passed this round:");

        lblTurnsPassRoundAns.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        lblTurnsPassRoundAns.setForeground(new java.awt.Color(255, 255, 255));
        lblTurnsPassRoundAns.setText("0");

        lblGameMessage.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        lblGameMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblGameMessage.setText("                                                     ...");

        btnNewMatch.setFont(new java.awt.Font("Raavi", 1, 14)); // NOI18N
        btnNewMatch.setText("Start New Match");
        btnNewMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMatchActionPerformed(evt);
            }
        });

        lblInstruct17.setFont(new java.awt.Font("BIZ UDPGothic", 1, 11)); // NOI18N
        lblInstruct17.setForeground(new java.awt.Color(255, 102, 102));
        lblInstruct17.setText("Note: At the completion of each match, it is reccomended that the players switch");

        lblInstruct18.setFont(new java.awt.Font("BIZ UDPGothic", 1, 11)); // NOI18N
        lblInstruct18.setForeground(new java.awt.Color(255, 102, 102));
        lblInstruct18.setText("who goes first as to not let one player gain an advantage. Though, each player must");

        lblInstruct19.setFont(new java.awt.Font("BIZ UDPGothic", 1, 11)); // NOI18N
        lblInstruct19.setForeground(new java.awt.Color(255, 102, 102));
        lblInstruct19.setText("maintain use of the same symbol.");

        javax.swing.GroupLayout panGameLayout = new javax.swing.GroupLayout(panGame);
        panGame.setLayout(panGameLayout);
        panGameLayout.setHorizontalGroup(
            panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGameLayout.createSequentialGroup()
                .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panGameLayout.createSequentialGroup()
                        .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGameLayout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(lblTurnsPassRoundAns, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panGameLayout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(lblTurnsPassRound)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panGameLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblGameMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panGameLayout.createSequentialGroup()
                        .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panGameLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnNewMatch))
                            .addGroup(panGameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblInstruct17))
                            .addGroup(panGameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblInstruct18))
                            .addGroup(panGameLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblInstruct19)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGameLayout.createSequentialGroup()
                        .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGrid4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrid1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrid7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panGameLayout.createSequentialGroup()
                                .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGameLayout.createSequentialGroup()
                                        .addComponent(txtGrid5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGrid6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panGameLayout.createSequentialGroup()
                                        .addComponent(txtGrid8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGrid9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(61, 61, 61)
                                .addComponent(btnFinishTurn))
                            .addGroup(panGameLayout.createSequentialGroup()
                                .addComponent(txtGrid2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtGrid3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGameLayout.createSequentialGroup()
                        .addComponent(lblPlayerTurn)
                        .addGap(214, 214, 214))))
        );
        panGameLayout.setVerticalGroup(
            panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstruct17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstruct19)
                .addGap(14, 14, 14)
                .addComponent(lblPlayerTurn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGameMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGameLayout.createSequentialGroup()
                        .addComponent(btnFinishTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGameLayout.createSequentialGroup()
                        .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGrid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGrid4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrid5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGrid7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrid8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrid9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)))
                .addGroup(panGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurnsPassRound)
                    .addComponent(lblTurnsPassRoundAns))
                .addGap(30, 30, 30)
                .addComponent(btnNewMatch)
                .addGap(33, 33, 33))
        );

        tabFullGame.addTab("Game", panGame);

        panStats.setBackground(new java.awt.Color(0, 51, 153));

        lblStatsTitle.setFont(new java.awt.Font("Antonio", 1, 24)); // NOI18N
        lblStatsTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblStatsTitle.setText("Statistics:");

        lblTotalTurnsPassed.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblTotalTurnsPassed.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTurnsPassed.setText("Number of total turns passed:");

        lblOWins.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblOWins.setForeground(new java.awt.Color(255, 255, 255));
        lblOWins.setText("Number of wins by \"o\":");

        lblXWins.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblXWins.setForeground(new java.awt.Color(255, 255, 255));
        lblXWins.setText("Number of wins by \"x\":");

        lblTies.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblTies.setForeground(new java.awt.Color(255, 255, 255));
        lblTies.setText("Number of ties:");

        lblTotalTurnsPassedAns.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblTotalTurnsPassedAns.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalTurnsPassedAns.setText("0");

        lbOWinsAns.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lbOWinsAns.setForeground(new java.awt.Color(255, 255, 255));
        lbOWinsAns.setText("0");

        lblXWinsAns.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblXWinsAns.setForeground(new java.awt.Color(255, 255, 255));
        lblXWinsAns.setText("0");

        lblTiesAns.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblTiesAns.setForeground(new java.awt.Color(255, 255, 255));
        lblTiesAns.setText("0");

        lblStatsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Stats.png"))); // NOI18N

        lblMatchesPlayed.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblMatchesPlayed.setForeground(new java.awt.Color(255, 255, 255));
        lblMatchesPlayed.setText("Number of matches played:");

        lblMatchesPlayedAns.setFont(new java.awt.Font("BIZ UDPGothic", 1, 14)); // NOI18N
        lblMatchesPlayedAns.setForeground(new java.awt.Color(255, 255, 255));
        lblMatchesPlayedAns.setText("0");

        javax.swing.GroupLayout panStatsLayout = new javax.swing.GroupLayout(panStats);
        panStats.setLayout(panStatsLayout);
        panStatsLayout.setHorizontalGroup(
            panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStatsLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panStatsLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblStatsImage)
                        .addGap(63, 63, 63)
                        .addComponent(lblStatsTitle))
                    .addGroup(panStatsLayout.createSequentialGroup()
                        .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalTurnsPassed)
                            .addComponent(lblOWins)
                            .addComponent(lblXWins)
                            .addComponent(lblTies)
                            .addComponent(lblMatchesPlayed))
                        .addGap(149, 149, 149)
                        .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatchesPlayedAns, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTiesAns, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblXWinsAns, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOWinsAns, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalTurnsPassedAns, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        panStatsLayout.setVerticalGroup(
            panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStatsLayout.createSequentialGroup()
                .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panStatsLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblStatsTitle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panStatsLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblStatsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalTurnsPassed)
                    .addComponent(lblTotalTurnsPassedAns))
                .addGap(18, 18, 18)
                .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOWins)
                    .addComponent(lbOWinsAns))
                .addGap(18, 18, 18)
                .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblXWins)
                    .addComponent(lblXWinsAns))
                .addGap(18, 18, 18)
                .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTies)
                    .addComponent(lblTiesAns))
                .addGap(18, 18, 18)
                .addGroup(panStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatchesPlayed)
                    .addComponent(lblMatchesPlayedAns))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        tabFullGame.addTab("Statistics", panStats);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabFullGame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabFullGame, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinishTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishTurnActionPerformed
        //Getting all the inputs from the board.
        userChoices[0] = txtGrid1.getText();
        userChoices[1] = txtGrid2.getText();
        userChoices[2] = txtGrid3.getText();
        userChoices[3] = txtGrid4.getText();
        userChoices[4] = txtGrid5.getText();
        userChoices[5] = txtGrid6.getText();
        userChoices[6] = txtGrid7.getText();
        userChoices[7] = txtGrid8.getText();
        userChoices[8] = txtGrid9.getText();
        
        //Declairs all variables in the "spaceUsed" arrary at the start of each match.
        if (turnsPassed == 1)
        {
            for (int i = 0; i <= 8; i++)
            {
                spaceUsed[i] = "";
            }
        }
        
        //Finds if the user placed a valid symbol or not.
        //"temp" helps to keep track of spaces on the game board that are blank.
        int temp = 0;
              
        for (int i = 0; i <= 8; i++)
        {        
            if (userChoices[i].equals(""))
            {
                temp++;
            } 
        }
        
        if (temp == 10 - turnsPassed)
        {
            lblGameMessage.setText("You have not entered anything this round.");
            proceed = false;
        }    
        else if (userChoices[0].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[0].equals("used old")||
                   userChoices[1].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[1].equals("used old")||
                   userChoices[2].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[2].equals("used old")||
                   userChoices[3].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[3].equals("used old")||
                   userChoices[4].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[4].equals("used old")||
                   userChoices[5].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[5].equals("used old")||
                   userChoices[6].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[6].equals("used old")||
                   userChoices[7].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[7].equals("used old")||
                   userChoices[8].equalsIgnoreCase("x") && temp == 9 - turnsPassed && !spaceUsed[8].equals("used old"))
            {
                lblGameMessage.setText("                                                     ...");
                proceed = true;
            }
        else if (userChoices[0].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[0].equals("used old") ||
                   userChoices[1].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[1].equals("used old")||
                   userChoices[2].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[2].equals("used old")||
                   userChoices[3].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[3].equals("used old")||
                   userChoices[4].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[4].equals("used old")||
                   userChoices[5].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[5].equals("used old")||
                   userChoices[6].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[6].equals("used old")||
                   userChoices[7].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[7].equals("used old")||
                   userChoices[8].equalsIgnoreCase("o") && temp == 9 - turnsPassed && !spaceUsed[8].equals("used old"))
            {
                lblGameMessage.setText("                                                     ...");
                proceed = true;
            }
            else
            {
                lblGameMessage.setText("Invalid Input. You must input \"x\" or \"o\" and only one symbol per round.");
                proceed = false;
            }
        
        //The if statement continues if the player enters a valid input.
        if (proceed == true)
        {
            //Finds the first symbol placed in a match.
            for (int i = 0; i <= 8; i++)
            {
                if (turnsPassed == 1 && userChoices[i].equalsIgnoreCase("x"))
                {
                    firstSymbol = "x";
                }
                else if (turnsPassed == 1 && userChoices[i].equalsIgnoreCase("o"))
                {
                    firstSymbol = "o";
                }
            }
            
            //Finds the symbol that should be played second in a match.
            if (firstSymbol.equals("x"))
            {
                secondSymbol = "o";
            }
            else
            {
                secondSymbol = "x";
            }
            
            //The program finds the most recently placed symbol.
            for (int i = 0; i <= 8; i++)
            {
                if (userChoices[i].equalsIgnoreCase("x") && !spaceUsed[i].equals("used old")||
                    userChoices[i].equalsIgnoreCase("o") && !spaceUsed[i].equals("used old"))
                {
                    spaceUsed[i] = "used new";
                }

                if (spaceUsed[i].equals("used new"))
                {
                    mostRecentSym = userChoices[i];
                }
            }
            
            //Tells the user who's turn it is and what symbol they have to play.
            if (mostRecentSym.equalsIgnoreCase(secondSymbol))
            {
                lblPlayerTurn.setText("It is Player 1's turn. Player 1 is \"" + firstSymbol + "\"");
            }
            else if (mostRecentSym.equalsIgnoreCase(firstSymbol))
            {
                lblPlayerTurn.setText("It is Player 2's turn. Player 2 is \"" + secondSymbol + "\"");
            }
            
            //Uses methods to find which symbol should be placed next.
            isXsTurn = whosTurn (firstSymbol, turnsPassed);
            
            if (isXsTurn == true && mostRecentSym.equalsIgnoreCase("x"))
            {
                lblGameMessage.setText("                                                     ...");
                proceed = true;
            }
            else if (isXsTurn == false && mostRecentSym.equalsIgnoreCase("x"))
            {
                lblGameMessage.setText("It is the other player's turn. The symbol should be \"o\".");
                proceed = false;
                
                for (int i = 0; i <= 8; i++)
                {
                    if (spaceUsed[i].equals("used new"))
                    {
                        spaceUsed[i] = "";    
                    }                       
                }
            } 
            else if (isXsTurn == false && mostRecentSym.equalsIgnoreCase("o"))
            {
                lblGameMessage.setText("                                                     ...");
                proceed = true;
            }
            else if (isXsTurn == true && mostRecentSym.equalsIgnoreCase("o"))
            {
                lblGameMessage.setText("It is the other player's turn. The symbol should be \"x\".");
                proceed = false;
                
                for (int i = 0; i <= 8; i++)
                {
                    if (spaceUsed[i].equals("used new"))
                    {
                        spaceUsed[i] = "";    
                    }                       
                }
            }
            
            //Increaces "turnsPassed" by one and outputs the number of turns passed to the user.
            if (proceed == true)
            {
                turnsPassed++;
                lblTurnsPassRoundAns.setText(String.valueOf(turnsPassed - 1));
            }
                
            /*Changes the most recent space used (on the grid) to an "old used" space
            so it can be ignored when trying to find what symbol was placed in the most recent turn.*/
            for (int i = 0; i <= 8; i++)
            {
                if (spaceUsed[i].equals("used new"))
                {
                    spaceUsed[i] = "used old"; 
                }             
            }

            //Uses methods to check if a user has won the game and also updates some statistics.
            winner = lineOfThree (userChoices[0], userChoices[1], userChoices[2], userChoices[3], userChoices[4],
                                                  userChoices[5], userChoices[6], userChoices[7], userChoices[8]);

            switch (winner) 
            {
                 case "\"o\"":
                    gamesWonO++;
                    break;
                case "\"x\"":
                    gamesWonX++;
                    break;
            }

            if (winner.equals("\"o\"") || winner.equals("\"x\""))
            {
                lblGameMessage.setText("Press the \"New Match\" Button to play again.");
                lblPlayerTurn.setText(winner + " wins this round!");
            }
                
            if (turnsPassed - 1 == NUM_FOR_TIE)
            {
                lblGameMessage.setText("Press the \"New Match\" Button to play again.");
                lblPlayerTurn.setText("This round is a tie!");
                gamesTied++;
            }
                
            //Updating Statistics.
            totalTurnsPassed++;
            lblTotalTurnsPassedAns.setText(String.valueOf(totalTurnsPassed));
        
            lbOWinsAns.setText(String.valueOf(gamesWonO));
        
            lblXWinsAns.setText(String.valueOf(gamesWonX));
        
            lblTiesAns.setText(String.valueOf(gamesTied));
                
            lblMatchesPlayedAns.setText(String.valueOf(gamesTied + gamesWonX + gamesWonO));
        }
    }//GEN-LAST:event_btnFinishTurnActionPerformed

    private void btnNewMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMatchActionPerformed
        //Sets all the nessasary variables to be ready to start a new match.
        turnsPassed = 1;
        mostRecentSym = "";

        for (int i = 0; i <= 8; i++)
        {
            userChoices[i] = "";
        }
        
        //Sets the game board board to blank.
        txtGrid1.setText("");
        txtGrid2.setText("");
        txtGrid3.setText("");
        txtGrid4.setText("");
        txtGrid5.setText("");
        txtGrid6.setText("");
        txtGrid7.setText("");
        txtGrid8.setText("");
        txtGrid9.setText("");
        
        //Updates messages displayed to the user.
        lblTurnsPassRoundAns.setText("0");
        lblPlayerTurn.setText("Player 1 goes first.");
        lblGameMessage.setText("                                                     ...");
        
    }//GEN-LAST:event_btnNewMatchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTicTacToeGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTicTacToeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinishTurn;
    private javax.swing.JButton btnNewMatch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbOWinsAns;
    private javax.swing.JLabel lblGameExplain1;
    private javax.swing.JLabel lblGameExplain2;
    private javax.swing.JLabel lblGameExplain3;
    private javax.swing.JLabel lblGameExplain4;
    private javax.swing.JLabel lblGameMessage;
    private javax.swing.JLabel lblInstruct1;
    private javax.swing.JLabel lblInstruct10;
    private javax.swing.JLabel lblInstruct11;
    private javax.swing.JLabel lblInstruct12;
    private javax.swing.JLabel lblInstruct13;
    private javax.swing.JLabel lblInstruct14;
    private javax.swing.JLabel lblInstruct15;
    private javax.swing.JLabel lblInstruct16;
    private javax.swing.JLabel lblInstruct17;
    private javax.swing.JLabel lblInstruct18;
    private javax.swing.JLabel lblInstruct19;
    private javax.swing.JLabel lblInstruct2;
    private javax.swing.JLabel lblInstruct3;
    private javax.swing.JLabel lblInstruct4;
    private javax.swing.JLabel lblInstruct5;
    private javax.swing.JLabel lblInstruct6;
    private javax.swing.JLabel lblInstruct7;
    private javax.swing.JLabel lblInstruct8;
    private javax.swing.JLabel lblInstruct9;
    private javax.swing.JLabel lblInstuctTitle;
    private javax.swing.JLabel lblMatchesPlayed;
    private javax.swing.JLabel lblMatchesPlayedAns;
    private javax.swing.JLabel lblOWins;
    private javax.swing.JLabel lblOr;
    private javax.swing.JLabel lblPaperQuillImage;
    private javax.swing.JLabel lblPlayerTurn;
    private javax.swing.JLabel lblStartMessage;
    private javax.swing.JLabel lblStartMessage1;
    private javax.swing.JLabel lblStatsImage;
    private javax.swing.JLabel lblStatsTitle;
    private javax.swing.JLabel lblTies;
    private javax.swing.JLabel lblTiesAns;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalTurnsPassed;
    private javax.swing.JLabel lblTotalTurnsPassedAns;
    private javax.swing.JLabel lblTurnsPassRound;
    private javax.swing.JLabel lblTurnsPassRoundAns;
    private javax.swing.JLabel lblXOImage1;
    private javax.swing.JLabel lblXOImage2;
    private javax.swing.JLabel lblXOImage3;
    private javax.swing.JLabel lblXOImage4;
    private javax.swing.JLabel lblXWins;
    private javax.swing.JLabel lblXWinsAns;
    private javax.swing.JPanel panGame;
    private javax.swing.JPanel panInstuct;
    private javax.swing.JPanel panStats;
    private javax.swing.JPanel panTitle;
    private javax.swing.JTabbedPane tabFullGame;
    private javax.swing.JTextField txtGrid1;
    private javax.swing.JTextField txtGrid2;
    private javax.swing.JTextField txtGrid3;
    private javax.swing.JTextField txtGrid4;
    private javax.swing.JTextField txtGrid5;
    private javax.swing.JTextField txtGrid6;
    private javax.swing.JTextField txtGrid7;
    private javax.swing.JTextField txtGrid8;
    private javax.swing.JTextField txtGrid9;
    // End of variables declaration//GEN-END:variables
}
