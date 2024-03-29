package example.grpcclient;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.concurrent.TimeUnit;
import service.*;
import test.TestProtobuf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.google.protobuf.Empty; // needed to use Empty

// just to show how to use the empty in the protobuf protocol
    // Empty empt = Empty.newBuilder().build();

/**
 * Client that requests `parrot` method from the `EchoServer`.
 */
public class Client {
  private final EchoGrpc.EchoBlockingStub blockingStub;
  private final JokeGrpc.JokeBlockingStub blockingStub2;
  private final RegistryGrpc.RegistryBlockingStub blockingStub3;
  private final RegistryGrpc.RegistryBlockingStub blockingStub4;
  private final userGrpc.userBlockingStub blockingStub5;
  private final TimerGrpc.TimerBlockingStub timerStub;
  private final RockPaperScissorsGrpc.RockPaperScissorsBlockingStub rpsStub;

  /** Construct client for accessing server using the existing channel. */
  public Client(Channel channel, Channel regChannel) {
    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's
    // responsibility to
    // shut it down.

    // Passing Channels to code makes code easier to test and makes it easier to
    // reuse Channels.
    blockingStub = EchoGrpc.newBlockingStub(channel);
    blockingStub2 = JokeGrpc.newBlockingStub(channel);
    blockingStub3 = RegistryGrpc.newBlockingStub(regChannel);
    blockingStub4 = RegistryGrpc.newBlockingStub(channel);
    blockingStub5 = userGrpc.newBlockingStub(channel);

    timerStub = TimerGrpc.newBlockingStub(channel);
    rpsStub = RockPaperScissorsGrpc.newBlockingStub(channel);
  }

  public void askServerToParrot(String message) {

    ClientRequest request = ClientRequest.newBuilder().setMessage(message).build();
    ServerResponse response;
    try {
      response = blockingStub.parrot(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    System.out.println("Received from server: " + response.getMessage());
  }

  public void askForJokes(int num) {
    JokeReq request = JokeReq.newBuilder().setNumber(num).build();
    JokeRes response;


    try {
      response = blockingStub2.getJoke(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
    System.out.println("Your jokes: ");
    for (String joke : response.getJokeList()) {
      System.out.println("--- " + joke);
    }
  }

  public void setJoke(String joke) {
    JokeSetReq request = JokeSetReq.newBuilder().setJoke(joke).build();
    JokeSetRes response;

    try {
      response = blockingStub2.setJoke(request);
      System.out.println(response.getOk());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void askServerToStartTimer(String message) {
    TimerRequest request = TimerRequest.newBuilder().setName(message).build();
    TimerResponse response;


    try {
      response = timerStub.start(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    System.out.println("Received from server: " + response.getIsSuccess());
    System.out.println(response.getError());
  }

  public void askServerToCheckTimer(String message) {
    TimerRequest request = TimerRequest.newBuilder().setName(message).build();
    TimerResponse response;


    try {
      response = timerStub.check(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    System.out.println("Received from server: " + response.getIsSuccess());
    System.out.println("Time elapsed: " + response.getTimer().getSecondsPassed());
  }

  public void askServerToCloseTimer(String message) {
    TimerRequest request = TimerRequest.newBuilder().setName(message).build();
    TimerResponse response;


    try {
      response = timerStub.close(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    System.out.println("Received from server: " + response.getIsSuccess());
    //System.out.println("User eliminated: " + response.getTimerList());
  }

  public void askServerToListTimers() {
    Empty empt = Empty.newBuilder().build();
    TimerList response;

    try {
      response = timerStub.list(empt);

    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }

    for(Time z : response.getTimersList()) {
      System.out.println("User: " + z.getName() + " Time: " + z.getSecondsPassed());
    }


  }

  public void askServerToplayeRPS(String name, int move) {
    PlayReq request = PlayReq.newBuilder().build();
    PlayRes response;

    if(move == 0) {
      request = PlayReq.newBuilder().setName(name).setPlay(PlayReq.Played.ROCK).build();
    }else if(move == 1) {
      request = PlayReq.newBuilder().setName(name).setPlay(PlayReq.Played.PAPER).build();
    }else if(move == 2) {
      request = PlayReq.newBuilder().setName(name).setPlay(PlayReq.Played.SCISSORS).build();
    }

    try {
      response = rpsStub.play(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    System.out.println(response.getMessage());
    System.out.println(response.getError());
  }

  public void askServerToListLeaders() {
    Empty empt = Empty.newBuilder().build();
    LeaderboardRes response;


    try {
      response = rpsStub.leaderboard(empt);

    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }

    for(LeaderboardEntry z : response.getLeaderboardList()) {
      System.out.println("User: " + z.getName() + " ----->Wins: " + z.getWins() + " ------>Losses: " + z.getLost());
    }
  }

  public void getNodeServices() {
    GetServicesReq request = GetServicesReq.newBuilder().build();
    ServicesListRes response;
    try {
      response = blockingStub4.getServices(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void getServices() {
    GetServicesReq request = GetServicesReq.newBuilder().build();
    ServicesListRes response;
    try {
      response = blockingStub3.getServices(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void findServer(String name) {
    FindServerReq request = FindServerReq.newBuilder().setServiceName(name).build();
    SingleServerRes response;
    try {
      response = blockingStub3.findServer(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void findServers(String name) {
    FindServersReq request = FindServersReq.newBuilder().setServiceName(name).build();
    ServerListRes response;
    try {
      response = blockingStub3.findServers(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void guessPassword(String username, String password) {

    LogReq lr = LogReq.newBuilder().setUse(username).setPas(password).build();

    ApiRes res = blockingStub5.login(lr);

    System.out.println(res.getResponseMsg());

  }

  public static void main(String[] args) throws Exception {
    if (args.length != 6) {
      System.out
          .println("Expected arguments: <host(String)> <port(int)> <regHost(string)> <regPort(int)> <message(String)> <regOn(bool)>");
      System.exit(1);
    }
    int port = 9099;
    int regPort = 9003;
    String host = args[0];
    String regHost = args[2];
    String message = args[4];
    try {
      port = Integer.parseInt(args[1]);
      regPort = Integer.parseInt(args[3]);
    } catch (NumberFormatException nfe) {
      System.out.println("[Port] must be an integer");
      System.exit(2);
    }

    // Create a communication channel to the server, known as a Channel. Channels
    // are thread-safe
    // and reusable. It is common to create channels at the beginning of your
    // application and reuse
    // them until the application shuts down.
    String target = host + ":" + port;
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS
        // to avoid
        // needing certificates.
        .usePlaintext().build();
    String regTarget = regHost + ":" + regPort;
    ManagedChannel regChannel = ManagedChannelBuilder.forTarget(regTarget).usePlaintext().build();
    try {

      // ##############################################################################
      // ## Assume we know the port here from the service node it is basically set through Gradle
      // here.
      // In your version you should first contact the registry to check which services
      // are available and what the port
      // etc is.

      /**
       * Your client should start off with 
       * 1. contacting the Registry to check for the available services
       * 2. List the services in the terminal and the client can
       *    choose one (preferably through numbering) 
       * 3. Based on what the client chooses
       *    the terminal should ask for input, eg. a new sentence, a sorting array or
       *    whatever the request needs 
       * 4. The request should be sent to one of the
       *    available services (client should call the registry again and ask for a
       *    Server providing the chosen service) should send the request to this service and
       *    return the response in a good way to the client
       * 
       * You should make sure your client does not crash in case the service node
       * crashes or went offline.
       */

      // Just doing some hard coded calls to the service node without using the
      // registry
      // create client
      EchoClient client = new EchoClient(channel, regChannel);

      client.askServerToParrot(message);

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
          System.out.println("What service would you like to use today?"); // NO ERROR handling of wrong input here.
          System.out.println("Choose you Services: 1 = Timer || 2 = Rock Paper Scissors || 3 = Joke || 4 = Song");
          String choice = reader.readLine();

          switch (choice) {
            case "1": {
              System.out.println("a = start, b = check, c = close, d = list");
              String choice2 = reader.readLine();

              switch (choice2) {
                case "a": {

                  System.out.println("Name of timer to start?");
                  String name = reader.readLine();
                  client.askServerToStartTimer(name);
                  break;
                }
                case "b": {

                  System.out.println("Name of timer to check?");
                  String name = reader.readLine();
                  client.askServerToCheckTimer(name);
                  break;
                }
                case "c": {

                  System.out.println("Name of timer to close?");
                  String name = reader.readLine();
                  client.askServerToCloseTimer(name);
                  break;
                }
                case "d": {
                  client.askServerToListTimers();
                  System.out.println("List returned: ");
                  break;
                }
              }
              break;
            }
            case "2": {
              System.out.println("a = Play, b = Leaderboard");
              String choice2 = reader.readLine();

              switch (choice2) {
                case "a": {
                  System.out.println("whats your name?");
                  String nameString = reader.readLine();


                  boolean correct = false;
                  String move = "";
                  int count = 0;
                  while (correct == false) {
                    System.out.println("Enter: 0 = rock, 1 = paper, 2 = scissor");
                    move = reader.readLine();
                    count = move.length();

                    for (int i = 0; i < move.length(); i++) {
                      Character temp = move.charAt(i);
                      if (Character.isDigit(temp)) {
                        correct = true;
                      } else {
                        System.out.println("not a digit");
                      }
                    }
                  }


                  try {
                    int played = Integer.parseInt(move);
                    client.askServerToplayeRPS(nameString, played);
                    break;
                  } catch (NumberFormatException e) {
                    e.printStackTrace();
                  }
                  break;
                }
                case "b": {
                  System.out.println("Leaderboard: ");
                  client.askServerToListLeaders();
                  break;
                }

              }
              break;
            }
            case "3": {
              System.out.println("a = Tell a joke, b = add a joke");
              String choice2 = reader.readLine();

              switch (choice2) {
                case "a": {
                  System.out.println("\n\nHow many jokes would you like to hear?");
                  System.out.print("Number: \n\n");
                  try {
                    int num = Integer.valueOf(reader.readLine());
                    client.askForJokes(num);
                  } catch (NumberFormatException e) {
                    System.out.println("\n\nIncorrect Number given!");
                  }
                }
                break;
                case "b": {
                  System.out.println("\n\nType a joke to add!");
                  System.out.print("Joke: \n\n");
                  String newJoke = reader.readLine();
                  client.setJoke(newJoke);
                  break;
                }
              }
              break;
            }
            case "4": {

                System.out.println("Guess the song: \n");
                System.out.println("You can dannceeee, you can jiveeeee, having the time of your lifeeee");

                String password = reader.readLine();
                client.guessPassword(password, password);
                break;
              }
            default:
              System.out.println("\n\nUnknown command!");
          }
          System.out.print("Enter exit to exit. Enter any other key to restart.");
          String cString = reader.readLine();
          if(cString.equalsIgnoreCase("exit")){
            System.out.println("Exiting...");
            break;
          }
        }
      } finally {
      // ManagedChannels use resources like threads and TCP connections. To prevent
      // leaking these
      // resources the channel should be shut down when it will no longer be used. If
      // it may be used
      // again leave it running.
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
      regChannel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
