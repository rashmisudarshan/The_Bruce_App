package com.example.thebruceapp.ui.home
import android.content.Intent
import com.example.thebruceapp.databinding.FragmentHomeBinding
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.thebruceapp.R


class HomeFragment : Fragment() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {


        val imageList = listOf<Image>(
            Image(
                R.drawable.greetings_1,
                "Greetings from Asbury Park, N.J.",
                "Blinded by the Light \nGrowin' Up \nMary Queen of Arkansas \nDoes This Bus Stop at 82nd Street? \nLost in the Flood \nThe Angel \nFor You \nSpirit in the Night \nIt's Hard to Be a Saint in the City"
            ),
            Image(
                R.drawable.the_wild_the_innocent,
                "The Wild, the Innocent & the E Street Shuffle",
                "The E Street Shuffle \n4th of July, Asbury Park (Sandy) \nKitty's Back \nWild Billy's Circus Story \nIncident on 57th Street \nRosalita (Come Out Tonight) \nNew York City Serenade"
            ),
            Image(
                R.drawable.born_to_run,
                "Born to Run",
                "Thunder Road \nTenth Avenue Freeze-Out \nNight \nBackstreets \nBorn to Run \nShe's the One \nMeeting Across the River \nJungleland"
            ),
            Image(
                R.drawable.darknessontheedgeoftown,
                "Darkness on the Edge of Town",
                "Badlands \nAdam Raised a Cain \nSomething in the Night \nCandy's Room \nRacing in the Street \nThe Promised Land \nFactory \nStreets of Fire \nProve It All Night \nDarkness on the Edge of Town"
            ),
            Image(
                R.drawable.theriver,
                "The River",
                "The Ties That Bind \nSherry Darling \nJackson Cage \nTwo Hearts \nIndependence Day \nHungry Heart \nOut in the Street \nCrush on You \nYou Can Look (But You Better Not Touch) \nI Wanna Marry You \nThe River \nPoint Blank \nCadillac Ranch \nI'm a Rocker \nFade Away \nStolen Car \nRamrod \nThe Price You Pay \nDrive All Night \nWreck on the Highway"
            ),
            Image(
                R.drawable.nebraska,
                "Nebraska",
                "Nebraska \nAtlantic City \nMansion on the Hill \nJohnny 99 \nHighway Patrolman \nState Trooper \nUsed Cars \nOpen All Night \nMy Father's House \nReason to Believe"
            ),
            Image(
                R.drawable.bornintheusa,
                "Born in the USA",
                "Born in the U.S.A. \nCover Me \nDarlington County \nWorking on the Highway \nDownbound Train \nI'm on Fire \nNo Surrender \nBobby Jean \nI'm Goin' Down \nGlory Days \nDancing in the Dark \nMy Hometown"
            ),
            Image(
                R.drawable.tunneloflove,
                "Tunnel of Love",
                "Ain't Got You \nTougher Than the Rest \nAll That Heaven Will Allow \nSpare Parts \nCautious Man \nWalk Like a Man \nTunnel of Love \nTwo Faces \nBrilliant Disguise \nOne Step Up \nWhen You're Alone \nValentine's Day"
            ),
            Image(
                R.drawable.humantouch,
                "Human Touch",
                "Human Touch \nSoul Driver \n57 Channels (And Nothin' On) \nCross My Heart \nGloria's Eyes \nWith Every Wish \nRoll of the Dice \nReal World \nAll or Nothin' at All \nMan's Job \nI Wish I Were Blind \nThe Long Goodbye \nReal Man \nPony Boy"
            ),
            Image(
                R.drawable.lucky_town,
                "Lucky Town",
                "Better Days \nLucky Town \nLocal Hero \nIf I Should Fall Behind \nLeap of Faith \nThe Big Muddy \nLiving Proof \nBook of Dreams \nSouls of the Departed \nMy Beautiful Reward"
            ),
            Image(
                R.drawable.theghostoftomjoad,
                "The Ghost of Tom Joad",
                "The Ghost of Tom Joad \nStraight Time \nHighway 29 \nYoungstown \nSinaloa Cowboys \nThe Line \nBalboa Park \nDry Lightning \nThe New Timer \nAcross the Border \nGalveston Bay \nMy Best Was Never Good Enough"
            ),
            Image(
                R.drawable.therising,
                "The Rising",
                "Lonesome Day \nInto the Fire \nWaitin' on a Sunny Day \nNothing Man \nCountin' on a Miracle \nEmpty Sky \nWorlds Apart \nLet's Be Friends (Skin to Skin) \nFurther On (Up the Road) \nThe Fuse \nMary's Place \nYou're Missing \nThe Rising \nParadise \nMy City of Ruins"
            ),
            Image(
                R.drawable.devilsanddust,
                "Devils & Dust",
                "Devils & Dust \nAll the Way Home \nReno \nLong Time Comin' \nBlack Cowboys \nMaria's Bed \nSilver Palomino \nJesus Was an Only Son \nLeah \nThe Hitter \nAll I'm Thinkin' About \nMatamoros Banks"
            ),
            Image(
                R.drawable.seegersessions,
                "We Shall Overcome: \nThe Seeger Sessions",
                "Old Dan Tucker \nJesse James \nMrs. McGrath \nO Mary Don't You Weep \nJohn Henry \nErie Canal \nJacob's Ladder \nMy Oklahoma Home \nEyes on the Prize \nShenandoah \nPay Me My Money Down \nWe Shall Overcome \nFroggie Went A-Courtin' \nBuffalo Gals \nHow Can I Keep from Singing? \nHow Can a Poor Man Stand Such Times and Live? \nBring 'Em Home \nAmerican Land"
            ),
            Image(
                R.drawable.magic,
                "Magic",
                "Radio Nowhere \nYou'll Be Comin' Down \nLivin' in the Future \nYour Own Worst Enemy \nGypsy Biker \nGirls in Their Summer Clothes \nI'll Work for Your Love \nMagic \nLast to Die \nLong Walk Home \nDevil's Arcade \nTerry's Song"
            ),
            Image(
                R.drawable.workingonadream,
                "Working on a Dream",
                "Outlaw Pete \nMy Lucky Day \nWorking on a Dream \nQueen of the Supermarket \nWhat Love Can Do \nThis Life \nGood Eye \nTomorrow Never Knows \nLife Itself \nKingdom of Days \nSurprise, Surprise \nThe Last Carnival \nThe Wrestler"
            ),
            Image(
                R.drawable.wrecking_ball,
                "Wrecking Ball",
                "We Take Care of Our Own \nEasy Money \nShackled and Drawn \nJack of All Trades \nDeath to My Hometown \nThis Depression \nWrecking Ball \nYou've Got It \nRocky Ground \nLand of Hope and Dreams \nWe Are Alive \nSwallowed Up (In the Belly of the Whale) \nAmerican Land"
            ),
            Image(
                R.drawable.high_hopes,
                "High Hopes",
                "High Hopes \nHarry's Place \nAmerican Skin (41 Shots) \nJust Like Fire Would \nDown in the Hole \nHeaven's Wall \nFrankie Fell in Love \nThis Is Your Sword \nHunter of Invisible Game \nThe Ghost of Tom Joad \nThe Wall \nDream Baby Dream"
            ),
            Image(
                R.drawable.westernstars,
                "Western Stars",
                "Hitch Hikin' \nThe Wayfarer \nTucson Train \nWestern Stars \nSleepy Joe's Café \nDrive Fast (The Stuntman) \nChasin' Wild Horses \nSundown \nSomewhere North of Nashville \nStones \nThere Goes My Miracle \nHello Sunshine \nMoonlight Motel"
            ),
            Image(
                R.drawable.lettertoyou,
                "Letter to You",
                "One Minute You're Here \nLetter to You \nBurnin' Train \nJaney Needs a Shooter \nLast Man Standing \nThe Power of Prayer \nHouse of a Thousand Guitars \nRainmaker \nIf I Was the Priest \nGhosts \nSong for Orphans \nI'll See You in My Dreams"
            )
        )

        val recyclerView = binding.imageRecyclerView
        recyclerView.layoutManager = GridLayoutManager(context, 2)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = context?.let {
            ImageAdapter(it, imageList) {
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)


            }
        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}