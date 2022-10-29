package myweb.secondboard;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args){
		SpringApplication.run(PracticeApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner initData(MemberRepository memberRepository,
//									  BoardRepository boardRepository,
//									  CommentRepository commentRepository){
//
//		return args -> IntStream.rangeClosed(1, 154).forEach(i -> {
//			try {
//				Member member = new Member();
//				PasswordEncrypt passwordEncrypt = new PasswordEncrypt();
//				member.setLoginId("testtest" + i);
//				member.setPassword(passwordEncrypt.encrypt("testtest" + i + "!"));
//				member.setNickname("test" + i);
//				member.setEmail("test" + i + "@gmail.com");
//				member.setBirthday("19951126");
//				member.setPhoneNumber("01021219" + String.format("%03d", i));
//				member.setGender(Gender.MALE);
//				member.setProvider(Provider.GOGOTENNIS);
//				memberRepository.save(member);
//
//				Board board = new Board();
//				DateTimeFo₩rmatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
//				board.setTitle("test" + i);
//				board.setAuthor(member.getNickname());
//				board.setContent("test" + i + "게시글 내용 입니다....");
//				board.setViews(0);
//				board.setCreatedDate(LocalDateTime.now().format(dtf));
//				board.setModifiedDate(LocalDateTime.now().format(dtf));
//				board.setMember(member);
//
//				Comment comment = new Comment();
//				comment.setContent("testtest" + i);
//				comment.setAuthor(member.getNickname());
//				comment.setCreatedDate(LocalDateTime.now().format(dtf));
//				comment.setModifiedDate(LocalDateTime.now().format(dtf));
//				comment.setMember(member);
//				comment.setBoard(board);
//
//				board.setComments(commentRepository.findComments(board.getId()));
//
//				boardRepository.save(board);
//				commentRepository.save(comment);
//
//
//
//
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		});
//	}

	public static int rand(int min, int max)
	{
		if (min > max || (max - min + 1 > Integer.MAX_VALUE)) {
			throw new IllegalArgumentException("Invalid range");
		}

		return new Random().nextInt(max - min + 1) + min;
	}

	public static int generate() {
		int r;
		do {
			r = 5 * (rand(1, 5) - 1) + rand(1, 5);
		} while (r > 7);

		return r;
	}


//	@Bean
//	public CommandLineRunner test(LocalRepository localRepository, TournamentRepository tournamentRepository) {
//		return args -> {
//			//==Local (지역) 테스트 데이터==//
//			List<String> locals = new ArrayList<>();
//			for (String s : Arrays.asList("서울", "경기", "강원", "경상", "전라", "충청", "제주")) {
//				locals.add(s);
//			}
//
//			for (int i = 1; i <= 7; i++) {
//				Local local = new Local();
//				local.setName(locals.get(i - 1));
//				localRepository.save(local);
//			}
//			//==Tournament(대회) 테스트 데이터==//
//			for (int i = 1; i <= 16; i++) {
//				Tournament tournament = new Tournament();
//
//				tournament.setCompStartDate(LocalDate.now());
//				tournament.setCompEndDate(LocalDate.now());
//				tournament.setApplicationStartDate(LocalDate.now());
//				tournament.setApplicationEndDate(LocalDate.now());
//				String url = "https://mdbootstrap.com/img/new/standard/nature";
//				Random random = new Random();
//				int a = random.nextInt(6) + 184;
//				tournament.setImage(url + "/" + a + ".jpg");
//				tournament.setPlace("올림픽공원");
//				tournament.setTitle("대회명" + i);
//
//				int val = generate();
//				tournament.setLocal(localRepository.findById((long) val).get());
//				tournamentRepository.save(tournament);
//			}
//		};
//
//	}
}
