package com.example.navigation_fyp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawer;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] t_disease=getResources().getStringArray(R.array.disease_title);
        String[] d_disease=getResources().getStringArray(R.array.disease_desc);





        toolbar=findViewById(R.id.toolbar);
        navigationView=findViewById(R.id.navigation);
        drawer=findViewById(R.id.drawer);

        setSupportActionBar(toolbar);
        toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawer.closeDrawer(GravityCompat.START);
                switch (item.getItemId()){

                    case R.id.dis_cataract:
                        Intent myintent = new Intent(MainActivity.this, disease_info.class);
                        myintent.putExtra("Dtitle","Cataract");
                        myintent.putExtra("Ddesc","A cataract is clouding or opacity of the lens inside the eye. It causes gradual blurring of vision and often glare.How cataract affects vision\n" +
                                "\n" +
                                "Inside your eye, behind the iris and pupil is a lens. In a normal eye, this lens is clear. It helps focus light rays on to the back of the eye (the retina), which sends messages to the brain allowing us to see. When cataract develops, the lens becomes cloudy and prevents the light rays from passing on to the retina. The picture that the retina receives becomes dull and fuzzy. Cataract usually forms slowly and most people experience a gradual blurring of vision.\n" +
                                "\n" +
                                "Causes of cataract\n" +
                                "\n" +
                                "Most forms of cataract develop in adult life. The normal process of ageing causes the lens to harden and become cloudy. This is called age-related cataract and it is the most common type. It can occur at any time after the age of 40. Although most cataracts are age related, there are other types, including congenital (present at birth), drug induced (steroids), and traumatic (injury to the eye). Cataract is also more common in people who have certain diseases such as diabetes.\n" +
                                "\n" +
                                "Treatments for cataract\n" +
                                "\n" +
                                "Surgery is the only available treatment for cataract and is very effective, straight-forward and quick for the vast majority of patients. We advise patients to have surgery when their cataract progresses to the point that it is interfering with daily activities or lifestyle – but it is usually safe to delay surgery if you do not feel that you have a problem with your vision or do not wish to have surgery.");
                        startActivity(myintent);
                        break;
                    case R.id.dis_glaucoma:
                        Intent glaucoIntent = new Intent(MainActivity.this, disease_info.class);
                        glaucoIntent.putExtra("Dtitle","Glaucoma");
                        glaucoIntent.putExtra("Ddesc","Glaucoma is an optic nerve disease. Optic nerve consists of ganglion cells that carry signals from the eye towards the brain. The nerve damage in glaucoma involves loss of retinal ganglion cells in a characteristic pattern. Raised pressure within the eye ball (above 21 mmHg) is the most important and modifiable risk factor for glaucoma. However, some may have high eye pressure for years and never develop damage, while others can develop nerve damage at a relatively low pressure. Untreated glaucoma can lead to permanent damage of the optic nerve and resultant visual field loss, which over time can progress to blindness.TESTS OF GLAUCOMA:\n" +
                                "\n" +
                                "TONOMETRY:\n" +
                                "\n" +
                                "The eye is numbed via eye drops after which the examiner uses a tonometer to measure the inner pressure of the eye.\n" +
                                "\n" +
                                "GONIOSCOPY:\n" +
                                "\n" +
                                "Eye drops are used to numb the eye after which a contact lens with a mirror is placed gently on the eye to see the angle between the cornea and the iris. This test usually helps to distinguish between open and closed angle types of glaucoma. It also helps to plan the management of glaucoma.");
                        startActivity(glaucoIntent);
                        break;
                    case R.id.dis_retinoblas:
                        Intent retinoIntent = new Intent(MainActivity.this, disease_info.class);
                        retinoIntent.putExtra("Dtitle","RetinoBlastoma");
                        retinoIntent.putExtra("Ddesc","Overview\n" +
                                " Anatomy of the eyeOpen pop-up dialog box\n" +
                                "Retinoblastoma is an eye cancer that begins in the retina — the sensitive lining on the inside of your eye. Retinoblastoma most commonly affects young children, but can rarely occur in adults.\n" +
                                "Your retina is made up of nerve tissue that senses light as it comes through the front of your eye. The retina sends signals through your optic nerve to your brain, where these signals are interpreted as images.\n" +
                                "A rare form of eye cancer, retinoblastoma is the most common form of cancer affecting the eye in children. Retinoblastoma may occur in one or both eyes.\n" +
                                "Symptoms\n" +
                                "Because retinoblastoma mostly affects infants and small children, symptoms are rare. Signs you may notice include:\n" +
                                "•\tA white color in the center circle of the eye (pupil) when light is shone in the eye, such as when taking a flash photograph\n" +
                                "•\tEyes that appear to be looking in different directions\n" +
                                "•\tEye redness\n" +
                                "•\tEye swelling\n" +
                                "When to see a doctor\n" +
                                "Make an appointment with your child's doctor if you notice any changes to your child's eyes that concern you. Retinoblastoma is a rare cancer, so your child's doctor may explore other more common eye conditions first.\n" +
                                "If you have a family history of retinoblastoma, ask your paediatrician when your child should begin regular eye exams to screen for retinoblastoma\n" +
                                "Causes\n" +
                                "Autosomal dominant inheritance patternOpen pop-up dialog box\n" +
                                "Retinoblastoma occurs when nerve cells in the retina develop genetic mutations. These mutations cause the cells to continue growing and multiplying when healthy cells would die. This accumulating mass of cells forms a tumor.\n" +
                                "Retinoblastoma cells can invade further into the eye and nearby structures. Retinoblastoma can also spread (metastasize) to other areas of the body, including the brain and spine.\n" +
                                "In the majority of cases, it's not clear what causes the genetic mutations that lead to retinoblastoma. However, it's possible for children to inherit a genetic mutation from their parents.\n" +
                                "Retinoblastoma that is inherited\n" +
                                "Gene mutations that increase the risk of retinoblastoma and other cancers can be passed from parents to children.\n" +
                                "Hereditary retinoblastoma is passed from parents to children in an autosomal dominant pattern, which means only one parent needs a single copy of the mutated gene to pass the increased risk of retinoblastoma on to the children. If one parent carries a mutated gene, each child has a 50 percent chance of inheriting that gene.\n" +
                                "Although a genetic mutation increases a child's risk of retinoblastoma, it doesn't mean that cancer is inevitable.\n" +
                                "Children with the inherited form of retinoblastoma tend to develop the disease at an earlier age. Hereditary retinoblastoma also tends to occur in both eyes, as opposed to just one eye.\n" +
                                "Complications\n" +
                                "Children treated for retinoblastoma have a risk of cancer returning in and around the treated eye. For this reason, your child's doctor will schedule follow-up exams to check for recurrent retinoblastoma. The doctor may design a personalized follow-up exam schedule for your child. In most cases, this will likely involve eye exams every few months for the first few years after retinoblastoma treatment ends.\n" +
                                "Additionally, children with the inherited form of retinoblastoma have an increased risk of developing other types of cancers in any part of the body in the years after treatment. For this reason, children with inherited retinoblastoma may have regular exams to screen for other cancers.\n" +
                                "Prevention\n" +
                                "In most cases, doctors aren't sure what causes retinoblastoma, so there's no proven way to prevent the disease.\n" +
                                "Prevention for families with inherited retinoblastoma\n" +
                                "In families with the inherited form of retinoblastoma, preventing retinoblastoma may not be possible. However, genetic testing enables families to know which children have an increased risk of retinoblastoma, so eye exams can begin at an early age. That way, retinoblastoma may be diagnosed very early — when the tumor is small and a chance for a cure and preservation of vision is still possible.\n" +
                                "If your doctor determines that your child's retinoblastoma was caused by an inherited genetic mutation, your family may be referred to a genetic counselor.\n" +
                                "Genetic testing can be used to determine whether:\n" +
                                "•\tYour child with retinoblastoma is at risk of other related cancers\n" +
                                "•\tYour other children are at risk of retinoblastoma and other related cancers, so they can start eye exams at an early age\n" +
                                "•\tYou and your partner have the possibility of passing the genetic mutation on to future children\n" +
                                "The genetic counselor can discuss the risks and benefits of genetic testing and help you decide whether you, your partner or your other children will be tested for the genetic mutation.\n" +
                                "\n");
                        startActivity(retinoIntent);
                        break;
                    case R.id.dis_diabetic:
                        Intent diabeticIntent = new Intent(MainActivity.this, disease_info.class);
                        diabeticIntent.putExtra("Dtitle","Diabetic Retinopathy");
                        diabeticIntent.putExtra("Ddesc","Diabetic retinopathy is a complication of diabetes, and causes damage to the blood vessels in the retina.\n" +
                                "\n" +
                                "Causes of diabetic retinopathy\n" +
                                "\n" +
                                "Many diabetics – particularly those with poor diabetic control which results in too-high blood sugar levels over long periods of time – have damaged blood vessels in the retina, the tissue lining the back of the eye that detects light and allows us to see. This condition, called diabetic retinopathy, affects up to eight out of 10 patients who have had diabetes for 10 years or more.\n" +
                                "\n" +
                                "Types of diabetic retinopathy\n" +
                                "\n" +
                                "Many people with mild diabetic retinopathy have good vision, but there are two types of sight-threatening diabetic retinopathy: diabetic macular oedema (DMO) and proliferative diabetic retinopathy (PDR). In DMO, fluid leaks out of the tiny damaged blood vessels in the back of the eye, and accumulates in the macula, the central part of the retina which is responsible for seeing fine details and central vision. This leads to swelling of the tissue and blurred vision. Eventually, patients with diabetic macular oedema can develop poor central vision and be unable to read or drive, but the vision to the side usually remains normal. Proliferative diabetic retinopathy is when the retinal blood vessels close resulting in the retina being starved of blood. This causes abnormal and very fragile blood vessels to grow on the surface of the retina which can lead to permanent loss of vision from bleeding into the eye, retinal scarring and retinal detachment.\n" +
                                "\n" +
                                "Treatment for diabetic retinopathy\n" +
                                "\n" +
                                "Regular eye checks are essential for all diabetics, so signs of diabetic retinopathy can be detected as early as possible. If you diabetic and experience blurred vision, you should visit an eye specialist immediately. If you develop DMO, you might require laser photocoagulation, which involves placing tiny laser burns in the area of leakage in the retina which slow the leakage of fluid and reduce the fluid in the eye. This may not significantly improve vision for some patients – although it can stop your vision from getting worse. Other treatments are available and have been shown to benefit patients with DMO, including injections of anti-VEGF drugs such as bevacizumab and ranibizumab. Ask your specialist if these treatments are suitable for you or available to you.");
                        startActivity(diabeticIntent);
                        break;
                    case R.id.about:
                        Intent aboutIntent = new Intent(MainActivity.this, disease_info.class);
                        aboutIntent.putExtra("Dtitle","About");
                        aboutIntent.putExtra("Ddesc","This Project Smart Eyecare System(Using Machine Learning) has been built as part of the Fyp for the partial fulfillment of the requirements for the degree of. Bachelor of Software Engineering NUML,Islamabad");
                        startActivity(aboutIntent);
                        break;
                    case R.id.faq:
                        Intent faqIntent = new Intent(MainActivity.this, disease_info.class);
                        faqIntent.putExtra("Dtitle","FAQ");
                        faqIntent.putExtra("Ddesc","1. Is this app Free\n"+"\n"+"Yes this app is Free for use with no in app purchases.\n"+"\n"+"2.How It will detect disease\n"+"\n"+"Using the PreTrained Machine Learning model which has been trained on thousands of Eye Fundus Images this app will predict diseases");
                        startActivity(faqIntent);
                        break;


                }

                return true;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
}