package com.example.citysearch.presentation.components

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import com.example.citysearch.R
import com.example.citysearch.domain.model.City

@Composable
fun CityItem(
    modifier: Modifier = Modifier,
    city: City,
) {
    val context = LocalContext.current
    val painter =
        rememberAsyncImagePainter("https://flagcdn.com/w80/${city.country.lowercase()}.png")
    val painterState = painter.state
    // Function to open Google Maps with coordinates
    val openGoogleMaps = {
        val gmmIntentUri = "geo:${city.coord.lat},${city.coord.lon}?q=${city.name}".toUri()
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")

        if (mapIntent.resolveActivity(context.packageManager) != null) {
            context.startActivity(mapIntent)
        } else {
            // Fallback for when Google Maps isn't installed
            val browserIntent = Intent(
                Intent.ACTION_VIEW,
                "https://www.google.com/maps/search/?api=1&query=${city.coord.lat},${city.coord.lon}".toUri()
            )
            context.startActivity(browserIntent)
        }
    }
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.Top
    ) {
        // Vertical line container - ALWAYS same width for alignment
        Box(
            modifier = Modifier
                .width(70.dp)
                .height(90.dp),
            contentAlignment = Alignment.TopCenter
        ) {
//            Box(
//                modifier = Modifier
//                    .width(2.dp)
//                    .fillMaxHeight()
//                    .background(color = colorResource(R.color.bgLightGreyFrame))
//                    .align(Alignment.TopCenter)
//                    .zIndex(1f)
//            )

//            if (isLast) {
//                Box(
//                    modifier = Modifier
//                        .size(10.dp)
//                        .clip(CircleShape)
//                        .background(Color.Gray)
//                        .align(Alignment.Center)
//                        .zIndex(2f)
//                )
//            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 5.dp, end = 16.dp, bottom = 10.dp)
                .clickable { openGoogleMaps() },
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),

            ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(colorResource(R.color.bgFlagFrame)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painter,
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    )
                    if (painterState is AsyncImagePainter.State.Error || painterState is AsyncImagePainter.State.Empty) {
                        Text(
                            text = city.country,
                            style = MaterialTheme.typography.labelMedium,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column {
                    Text(
                        text = "${city.name}, ${city.country}",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Medium
                    )

                    Text(
                        text = "${city.coord.lat}, ${city.coord.lon}",
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier= Modifier.padding(top = 10.dp)
                    )
                }
            }
        }
    }
}